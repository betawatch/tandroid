// default package

import android.os.SystemClock;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class od2 implements Runnable {
    public final /* synthetic */ qd2 a;

    public od2(qd2 qd2Var) {
        this.a = qd2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        qd2 qd2Var = this.a;
        vh6 vh6Var = qd2Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i2 = 0;
        boolean z = false;
        while (i2 < vh6Var.m()) {
            long j = vh6Var.j(i2);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) vh6Var.f(j)).lastSpeakTime >= 500) {
                vh6Var.l(j);
                j5 j5Var = qd2Var.C;
                if (j > 0) {
                    TLRPC.User W1 = oc7.r1(j5Var.a).W1(Long.valueOf(j));
                    ts2.w(wi8.o(j, "remove from speaking ", " "), W1 != null ? W1.first_name : null, "GroupCall");
                    i = i2;
                } else {
                    oc7 r1 = oc7.r1(j5Var.a);
                    i = i2;
                    TLRPC.Chat L0 = r1.L0(Long.valueOf(-j));
                    ts2.w(wi8.o(j, "remove from speaking ", " "), L0 != null ? L0.title : null, "GroupCall");
                }
                i2 = i - 1;
                z = true;
            }
            i2++;
        }
        if (vh6Var.m() > 0) {
            gm.d3(qd2Var.Q, 550L);
        }
        if (z) {
            nm7.f(qd2Var.C.a).k(nm7.y2, Long.valueOf(qd2Var.c), Long.valueOf(qd2Var.b.id), Boolean.FALSE);
        }
    }
}
