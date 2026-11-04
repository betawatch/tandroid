package c3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import d2.a2;
import g2.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ l b;

    public k(l lVar, t2.l lVar2) {
        this.b = lVar;
        Handler q10 = n0.q(this);
        this.a = q10;
        lVar2.h(this, q10);
    }

    public final void a(long j10) {
        Surface surface;
        l lVar = this.b;
        tf.b bVar = lVar.c1;
        if (this != lVar.N1 || lVar.e0 == null) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            lVar.N0 = true;
            return;
        }
        try {
            lVar.C0(j10);
            a2 a2Var = lVar.I1;
            if (!a2Var.equals(a2.d) && !a2Var.equals(lVar.J1)) {
                lVar.J1 = a2Var;
                bVar.E(a2Var);
            }
            lVar.P0.e++;
            y yVar = lVar.f1;
            boolean z10 = yVar.e != 3;
            yVar.e = 3;
            yVar.l.getClass();
            yVar.g = n0.S(SystemClock.elapsedRealtime());
            if (z10 && (surface = lVar.s1) != null) {
                bVar.y(surface);
                lVar.v1 = true;
            }
            lVar.h0(j10);
        } catch (k2.l e10) {
            lVar.O0 = e10;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i3 = message.arg1;
        int i10 = message.arg2;
        String str = n0.a;
        a(((i3 & 4294967295L) << 32) | (4294967295L & i10));
        return true;
    }
}
