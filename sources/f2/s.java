package f2;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final b7.r f = new b7.r(3);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static m1 c(RecyclerView recyclerView, int i10, long j10) {
        int u10 = recyclerView.e.u();
        for (int i11 = 0; i11 < u10; i11++) {
            m1 U = RecyclerView.U(recyclerView.e.t(i11));
            if (U.c == i10 && !U.h()) {
                return null;
            }
        }
        bf.f fVar = recyclerView.b;
        try {
            try {
                recyclerView.g0();
                m1 j11 = fVar.j(i10, j10);
                if (j11 != null) {
                    if (!j11.g() || j11.h()) {
                        fVar.a(j11, false);
                    } else {
                        fVar.g(j11.a);
                    }
                }
                recyclerView.h0(false);
                return j11;
            } catch (Exception e6) {
                FileLog.e(e6);
                AndroidUtilities.runOnUIThread(new eh.m(recyclerView, 2));
                recyclerView.h0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.h0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.D && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        androidx.datastore.preferences.protobuf.i iVar = recyclerView.p0;
        iVar.a = i10;
        iVar.b = i11;
    }

    public final void b(long j10) {
        r rVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        r rVar2;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            androidx.datastore.preferences.protobuf.i iVar = recyclerView3.p0;
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
                androidx.datastore.preferences.protobuf.i iVar2 = recyclerView4.p0;
                int abs = Math.abs(iVar2.b) + Math.abs(iVar2.a);
                for (int i14 = 0; i14 < iVar2.c * 2; i14 += 2) {
                    if (i12 >= arrayList.size()) {
                        rVar2 = new r();
                        arrayList.add(rVar2);
                    } else {
                        rVar2 = (r) arrayList.get(i12);
                    }
                    int[] iArr = (int[]) iVar2.d;
                    int i15 = iArr[i14 + 1];
                    rVar2.a = i15 <= abs;
                    rVar2.b = abs;
                    rVar2.c = i15;
                    rVar2.d = recyclerView4;
                    rVar2.e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (rVar = (r) arrayList.get(i16)).d) != null; i16++) {
            m1 c3 = c(recyclerView, rVar.e, rVar.a ? Long.MAX_VALUE : j10);
            if (c3 != null && c3.b != null && c3.g() && !c3.h() && (recyclerView2 = (RecyclerView) c3.b.get()) != null) {
                if (recyclerView2.N && recyclerView2.e.u() != 0) {
                    recyclerView2.o0();
                }
                androidx.datastore.preferences.protobuf.i iVar3 = recyclerView2.p0;
                iVar3.b(recyclerView2, true);
                if (iVar3.c != 0) {
                    try {
                        int i17 = n0.g.a;
                        Trace.beginSection("RV Nested Prefetch");
                        j1 j1Var = recyclerView2.q0;
                        p0 p0Var = recyclerView2.w;
                        j1Var.d = 1;
                        j1Var.e = p0Var.h();
                        j1Var.g = false;
                        j1Var.h = false;
                        j1Var.i = false;
                        for (int i18 = 0; i18 < iVar3.c * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) iVar3.d)[i18], j10);
                        }
                        Trace.endSection();
                        rVar.a = false;
                        rVar.b = 0;
                        rVar.c = 0;
                        rVar.d = null;
                        rVar.e = 0;
                    } catch (Throwable th2) {
                        int i19 = n0.g.a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            rVar.a = false;
            rVar.b = 0;
            rVar.c = 0;
            rVar.d = null;
            rVar.e = 0;
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
        } catch (Throwable th2) {
            this.b = 0L;
            int i12 = n0.g.a;
            Trace.endSection();
            throw th2;
        }
    }
}
