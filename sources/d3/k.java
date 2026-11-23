package d3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import e2.x1;
import h2.l0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class k implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ l b;

    public k(l lVar, u2.l lVar2) {
        this.b = lVar;
        Handler q10 = l0.q(this);
        this.a = q10;
        lVar2.k(this, q10);
    }

    public final void a(long j3) {
        Surface surface;
        l lVar = this.b;
        wf.b bVar = lVar.c1;
        if (this != lVar.N1 || lVar.e0 == null) {
            return;
        }
        if (j3 == Long.MAX_VALUE) {
            lVar.N0 = true;
            return;
        }
        try {
            lVar.C0(j3);
            x1 x1Var = lVar.I1;
            if (!x1Var.equals(x1.d) && !x1Var.equals(lVar.J1)) {
                lVar.J1 = x1Var;
                bVar.V(x1Var);
            }
            lVar.P0.e++;
            x xVar = lVar.f1;
            boolean z10 = xVar.e != 3;
            xVar.e = 3;
            xVar.l.getClass();
            xVar.g = l0.S(SystemClock.elapsedRealtime());
            if (z10 && (surface = lVar.s1) != null) {
                bVar.P(surface);
                lVar.v1 = true;
            }
            lVar.h0(j3);
        } catch (l2.l e10) {
            lVar.O0 = e10;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i7 = message.arg1;
        int i10 = message.arg2;
        String str = l0.a;
        a(((i7 & 4294967295L) << 32) | (4294967295L & i10));
        return true;
    }
}
