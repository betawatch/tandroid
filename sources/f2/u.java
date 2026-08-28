package f2;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final d2.a f = new d2.a(2);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static q1 c(RecyclerView recyclerView, int i9, long j10) {
        int v = recyclerView.e.v();
        for (int i10 = 0; i10 < v; i10++) {
            q1 U = RecyclerView.U(recyclerView.e.u(i10));
            if (U.c == i9 && !U.h()) {
                return null;
            }
        }
        g1 g1Var = recyclerView.b;
        try {
            try {
                recyclerView.g0();
                q1 j11 = g1Var.j(i9, j10);
                if (j11 != null) {
                    if (!j11.g() || j11.h()) {
                        g1Var.a(j11, false);
                    } else {
                        g1Var.g(j11.a);
                    }
                }
                recyclerView.h0(false);
                return j11;
            } catch (Exception e10) {
                FileLog.e(e10);
                AndroidUtilities.runOnUIThread(new af.e(recyclerView, 24));
                recyclerView.h0(false);
                return null;
            }
        } catch (Throwable th) {
            recyclerView.h0(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i9, int i10) {
        if (recyclerView.C && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        androidx.datastore.preferences.protobuf.i iVar = recyclerView.o0;
        iVar.a = i9;
        iVar.b = i10;
    }

    public final void b(long j10) {
        t tVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        t tVar2;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i10);
            int windowVisibility = recyclerView3.getWindowVisibility();
            androidx.datastore.preferences.protobuf.i iVar = recyclerView3.o0;
            if (windowVisibility == 0) {
                iVar.b(recyclerView3, false);
                i9 += iVar.c;
            }
        }
        arrayList.ensureCapacity(i9);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                androidx.datastore.preferences.protobuf.i iVar2 = recyclerView4.o0;
                int abs = Math.abs(iVar2.b) + Math.abs(iVar2.a);
                for (int i13 = 0; i13 < iVar2.c * 2; i13 += 2) {
                    if (i11 >= arrayList.size()) {
                        tVar2 = new t();
                        arrayList.add(tVar2);
                    } else {
                        tVar2 = (t) arrayList.get(i11);
                    }
                    int[] iArr = (int[]) iVar2.d;
                    int i14 = iArr[i13 + 1];
                    tVar2.a = i14 <= abs;
                    tVar2.b = abs;
                    tVar2.c = i14;
                    tVar2.d = recyclerView4;
                    tVar2.e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i15 = 0; i15 < arrayList.size() && (recyclerView = (tVar = (t) arrayList.get(i15)).d) != null; i15++) {
            q1 c10 = c(recyclerView, tVar.e, tVar.a ? Long.MAX_VALUE : j10);
            if (c10 != null && c10.b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.b.get()) != null) {
                if (recyclerView2.M && recyclerView2.e.v() != 0) {
                    recyclerView2.o0();
                }
                androidx.datastore.preferences.protobuf.i iVar3 = recyclerView2.o0;
                iVar3.b(recyclerView2, true);
                if (iVar3.c != 0) {
                    try {
                        int i16 = n0.g.a;
                        Trace.beginSection("RV Nested Prefetch");
                        n1 n1Var = recyclerView2.p0;
                        r0 r0Var = recyclerView2.w;
                        n1Var.d = 1;
                        n1Var.e = r0Var.h();
                        n1Var.g = false;
                        n1Var.h = false;
                        n1Var.i = false;
                        for (int i17 = 0; i17 < iVar3.c * 2; i17 += 2) {
                            c(recyclerView2, ((int[]) iVar3.d)[i17], j10);
                        }
                        Trace.endSection();
                        tVar.a = false;
                        tVar.b = 0;
                        tVar.c = 0;
                        tVar.d = null;
                        tVar.e = 0;
                    } catch (Throwable th) {
                        int i18 = n0.g.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            tVar.a = false;
            tVar.b = 0;
            tVar.c = 0;
            tVar.d = null;
            tVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            int i9 = n0.g.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j10) + this.c);
                }
            }
            this.b = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.b = 0L;
            int i11 = n0.g.a;
            Trace.endSection();
            throw th;
        }
    }
}
