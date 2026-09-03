package g5;

import android.os.SystemClock;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class r {
    public final /* synthetic */ s a;

    public final void a(int i10) {
        s sVar = this.a;
        synchronized (sVar) {
            synchronized (sVar) {
                int i11 = sVar.i;
                if (i11 == 0 || sVar.e) {
                    if (i11 == i10) {
                        return;
                    }
                    sVar.i = i10;
                    if (i10 != 1 && i10 != 0 && i10 != 8) {
                        sVar.l = sVar.a(i10);
                        sVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        sVar.c(sVar.f > 0 ? (int) (elapsedRealtime - sVar.g) : 0, sVar.h, sVar.l);
                        sVar.g = elapsedRealtime;
                        sVar.h = 0L;
                        sVar.k = 0L;
                        sVar.j = 0L;
                        t0 t0Var = sVar.c;
                        t0Var.b.clear();
                        t0Var.d = -1;
                        t0Var.e = 0;
                        t0Var.f = 0;
                    }
                }
            }
        }
    }
}
