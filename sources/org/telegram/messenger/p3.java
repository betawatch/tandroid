package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Log;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p3 implements Runnable {
    public final /* synthetic */ r3 a;

    public p3(r3 r3Var) {
        this.a = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        r3 r3Var = this.a;
        a0.h hVar = r3Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < hVar.m()) {
            long j10 = hVar.j(i10);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) hVar.f(j10)).lastSpeakTime >= 500) {
                hVar.l(j10);
                if (j10 > 0) {
                    TLRPC.User a22 = hp.s1(r3Var.C.a).a2(Long.valueOf(j10));
                    StringBuilder t10 = a1.g.t(j10, "remove from speaking ", " ");
                    t10.append(a22 != null ? a22.first_name : null);
                    Log.d("GroupCall", t10.toString());
                    i3 = i10;
                } else {
                    i3 = i10;
                    TLRPC.Chat M0 = hp.s1(r3Var.C.a).M0(Long.valueOf(-j10));
                    StringBuilder t11 = a1.g.t(j10, "remove from speaking ", " ");
                    t11.append(M0 != null ? M0.title : null);
                    Log.d("GroupCall", t11.toString());
                }
                i10 = i3 - 1;
                z10 = true;
            }
            i10++;
        }
        if (hVar.m() > 0) {
            g0.i3(r3Var.Q, 550L);
        }
        if (z10) {
            hs.f(r3Var.C.a).k(hs.y2, Long.valueOf(r3Var.c), Long.valueOf(r3Var.b.id), Boolean.FALSE);
        }
    }
}
