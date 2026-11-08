package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class p3 implements Runnable {
    public final /* synthetic */ r3 a;

    public p3(r3 r3Var) {
        this.a = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        r3 r3Var = this.a;
        a0.h hVar = r3Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i10 = 0;
        boolean z9 = false;
        while (i10 < hVar.m()) {
            long j3 = hVar.j(i10);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) hVar.f(j3)).lastSpeakTime >= 500) {
                hVar.l(j3);
                if (j3 > 0) {
                    TLRPC.User a22 = qp.s1(r3Var.C.a).a2(Long.valueOf(j3));
                    rf.b.p(a8.p0.t(j3, "remove from speaking ", " "), a22 != null ? a22.first_name : null, "GroupCall");
                    i7 = i10;
                } else {
                    i7 = i10;
                    TLRPC.Chat M0 = qp.s1(r3Var.C.a).M0(Long.valueOf(-j3));
                    rf.b.p(a8.p0.t(j3, "remove from speaking ", " "), M0 != null ? M0.title : null, "GroupCall");
                }
                i10 = i7 - 1;
                z9 = true;
            }
            i10++;
        }
        if (hVar.m() > 0) {
            g0.i3(r3Var.Q, 550L);
        }
        if (z9) {
            qs.f(r3Var.C.a).k(qs.y2, Long.valueOf(r3Var.c), Long.valueOf(r3Var.b.id), Boolean.FALSE);
        }
    }
}
