package d3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import e2.x1;
import h2.m0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class k implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ l b;

    public k(l lVar, u2.l lVar2) {
        this.b = lVar;
        Handler q10 = m0.q(this);
        this.a = q10;
        lVar2.i(this, q10);
    }

    public final void a(long j3) {
        Surface surface;
        l lVar = this.b;
        wf.b bVar = lVar.b1;
        if (this != lVar.M1 || lVar.d0 == null) {
            return;
        }
        if (j3 == Long.MAX_VALUE) {
            lVar.M0 = true;
            return;
        }
        try {
            lVar.C0(j3);
            x1 x1Var = lVar.H1;
            if (!x1Var.equals(x1.d) && !x1Var.equals(lVar.I1)) {
                lVar.I1 = x1Var;
                bVar.m0(x1Var);
            }
            lVar.O0.e++;
            y yVar = lVar.e1;
            boolean z9 = yVar.e != 3;
            yVar.e = 3;
            yVar.l.getClass();
            yVar.g = m0.S(SystemClock.elapsedRealtime());
            if (z9 && (surface = lVar.r1) != null) {
                bVar.g0(surface);
                lVar.u1 = true;
            }
            lVar.h0(j3);
        } catch (l2.l e10) {
            lVar.N0 = e10;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i7 = message.arg1;
        int i10 = message.arg2;
        String str = m0.a;
        a(((i7 & 4294967295L) << 32) | (4294967295L & i10));
        return true;
    }
}
