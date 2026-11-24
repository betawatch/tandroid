// default package

import android.os.SystemClock;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class dc2 implements Runnable {
    public final /* synthetic */ fc2 a;

    public dc2(fc2 fc2Var) {
        this.a = fc2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        fc2 fc2Var = this.a;
        vf6 vf6Var = fc2Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i2 = 0;
        boolean z = false;
        while (i2 < vf6Var.m()) {
            long j = vf6Var.j(i2);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) vf6Var.f(j)).lastSpeakTime >= 500) {
                vf6Var.l(j);
                j5 j5Var = fc2Var.C;
                if (j > 0) {
                    TLRPC.User V1 = na7.q1(j5Var.a).V1(Long.valueOf(j));
                    ir2.x(ug8.o(j, "remove from speaking ", " "), V1 != null ? V1.first_name : null, "GroupCall");
                    i = i2;
                } else {
                    na7 q1 = na7.q1(j5Var.a);
                    i = i2;
                    TLRPC.Chat K0 = q1.K0(Long.valueOf(-j));
                    ir2.x(ug8.o(j, "remove from speaking ", " "), K0 != null ? K0.title : null, "GroupCall");
                }
                i2 = i - 1;
                z = true;
            }
            i2++;
        }
        if (vf6Var.m() > 0) {
            gl.e3(fc2Var.Q, 550L);
        }
        if (z) {
            kk7.f(fc2Var.C.a).k(kk7.x2, Long.valueOf(fc2Var.c), Long.valueOf(fc2Var.b.id), Boolean.FALSE);
        }
    }
}
