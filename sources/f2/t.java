package f2;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final d2.a f = new d2.a(2);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static o1 c(RecyclerView recyclerView, int i10, long j10) {
        int t10 = recyclerView.e.t();
        for (int i11 = 0; i11 < t10; i11++) {
            o1 U = RecyclerView.U(recyclerView.e.s(i11));
            if (U.c == i10 && !U.h()) {
                return null;
            }
        }
        e1 e1Var = recyclerView.b;
        try {
            try {
                recyclerView.g0();
                o1 j11 = e1Var.j(i10, j10);
                if (j11 != null) {
                    if (!j11.g() || j11.h()) {
                        e1Var.a(j11, false);
                    } else {
                        e1Var.g(j11.a);
                    }
                }
                recyclerView.h0(false);
                return j11;
            } catch (Exception e9) {
                FileLog.e(e9);
                AndroidUtilities.runOnUIThread(new r(recyclerView, 0));
                recyclerView.h0(false);
                return null;
            }
        } catch (Throwable th) {
            recyclerView.h0(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.C && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        androidx.datastore.preferences.protobuf.i iVar = recyclerView.o0;
        iVar.a = i10;
        iVar.b = i11;
    }

    public final void b(long j10) {
        s sVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        s sVar2;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            androidx.datastore.preferences.protobuf.i iVar = recyclerView3.o0;
            if (windowVisibility == 0) {
                iVar.b(recyclerView3, false);
                i10 += iVar.c;
            }
        }
        arrayList.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                androidx.datastore.preferences.protobuf.i iVar2 = recyclerView4.o0;
                int abs = Math.abs(iVar2.b) + Math.abs(iVar2.a);
                for (int i14 = 0; i14 < iVar2.c * 2; i14 += 2) {
                    if (i12 >= arrayList.size()) {
                        sVar2 = new s();
                        arrayList.add(sVar2);
                    } else {
                        sVar2 = (s) arrayList.get(i12);
                    }
                    int[] iArr = (int[]) iVar2.d;
                    int i15 = iArr[i14 + 1];
                    sVar2.a = i15 <= abs;
                    sVar2.b = abs;
                    sVar2.c = i15;
                    sVar2.d = recyclerView4;
                    sVar2.e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (sVar = (s) arrayList.get(i16)).d) != null; i16++) {
            o1 c10 = c(recyclerView, sVar.e, sVar.a ? Long.MAX_VALUE : j10);
            if (c10 != null && c10.b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.b.get()) != null) {
                if (recyclerView2.M && recyclerView2.e.t() != 0) {
                    recyclerView2.o0();
                }
                androidx.datastore.preferences.protobuf.i iVar3 = recyclerView2.o0;
                iVar3.b(recyclerView2, true);
                if (iVar3.c != 0) {
                    try {
                        int i17 = n0.g.a;
                        Trace.beginSection("RV Nested Prefetch");
                        l1 l1Var = recyclerView2.p0;
                        q0 q0Var = recyclerView2.w;
                        l1Var.d = 1;
                        l1Var.e = q0Var.h();
                        l1Var.g = false;
                        l1Var.h = false;
                        l1Var.i = false;
                        for (int i18 = 0; i18 < iVar3.c * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) iVar3.d)[i18], j10);
                        }
                        Trace.endSection();
                        sVar.a = false;
                        sVar.b = 0;
                        sVar.c = 0;
                        sVar.d = null;
                        sVar.e = 0;
                    } catch (Throwable th) {
                        int i19 = n0.g.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            sVar.a = false;
            sVar.b = 0;
            sVar.c = 0;
            sVar.d = null;
            sVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            int i10 = n0.g.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
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
            int i12 = n0.g.a;
            Trace.endSection();
            throw th;
        }
    }
}
