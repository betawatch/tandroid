package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Log;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s3 implements Runnable {
    public final /* synthetic */ u3 a;

    public s3(u3 u3Var) {
        this.a = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        u3 u3Var = this.a;
        a0.h hVar = u3Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < hVar.m()) {
            long j10 = hVar.j(i11);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) hVar.f(j10)).lastSpeakTime >= 500) {
                hVar.l(j10);
                if (j10 > 0) {
                    TLRPC.User Z1 = vp.r1(u3Var.C.a).Z1(Long.valueOf(j10));
                    StringBuilder s10 = a1.g.s(j10, "remove from speaking ", " ");
                    s10.append(Z1 != null ? Z1.first_name : null);
                    Log.d("GroupCall", s10.toString());
                    i10 = i11;
                } else {
                    i10 = i11;
                    TLRPC.Chat L0 = vp.r1(u3Var.C.a).L0(Long.valueOf(-j10));
                    StringBuilder s11 = a1.g.s(j10, "remove from speaking ", " ");
                    s11.append(L0 != null ? L0.title : null);
                    Log.d("GroupCall", s11.toString());
                }
                i11 = i10 - 1;
                z10 = true;
            }
            i11++;
        }
        if (hVar.m() > 0) {
            i0.h3(u3Var.Q, 550L);
        }
        if (z10) {
            zs.f(u3Var.C.a).k(zs.y2, Long.valueOf(u3Var.c), Long.valueOf(u3Var.b.id), Boolean.FALSE);
        }
    }
}
