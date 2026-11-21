package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class r3 implements Runnable {
    public final /* synthetic */ t3 a;

    public r3(t3 t3Var) {
        this.a = t3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        t3 t3Var = this.a;
        a0.h hVar = t3Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < hVar.m()) {
            long j3 = hVar.j(i10);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) hVar.f(j3)).lastSpeakTime >= 500) {
                hVar.l(j3);
                if (j3 > 0) {
                    TLRPC.User c22 = mp.u1(t3Var.C.a).c2(Long.valueOf(j3));
                    p5.c.t(a8.p0.t(j3, "remove from speaking ", " "), c22 != null ? c22.first_name : null, "GroupCall");
                    i7 = i10;
                } else {
                    i7 = i10;
                    TLRPC.Chat O0 = mp.u1(t3Var.C.a).O0(Long.valueOf(-j3));
                    p5.c.t(a8.p0.t(j3, "remove from speaking ", " "), O0 != null ? O0.title : null, "GroupCall");
                }
                i10 = i7 - 1;
                z10 = true;
            }
            i10++;
        }
        if (hVar.m() > 0) {
            g0.h3(t3Var.Q, 550L);
        }
        if (z10) {
            ks.f(t3Var.C.a).k(ks.y2, Long.valueOf(t3Var.c), Long.valueOf(t3Var.b.id), Boolean.FALSE);
        }
    }
}
