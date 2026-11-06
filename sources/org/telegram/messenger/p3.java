package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Log;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                    StringBuilder t6 = a8.p0.t(j3, "remove from speaking ", " ");
                    t6.append(a22 != null ? a22.first_name : null);
                    Log.d("GroupCall", t6.toString());
                    i7 = i10;
                } else {
                    i7 = i10;
                    TLRPC.Chat M0 = qp.s1(r3Var.C.a).M0(Long.valueOf(-j3));
                    StringBuilder t10 = a8.p0.t(j3, "remove from speaking ", " ");
                    t10.append(M0 != null ? M0.title : null);
                    Log.d("GroupCall", t10.toString());
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
