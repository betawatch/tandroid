package a3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import b2.b2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class m implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ n b;

    public m(n nVar, r2.l lVar) {
        this.b = nVar;
        Handler q5 = e2.n0.q(this);
        this.a = q5;
        lVar.g(this, q5);
    }

    public final void a(long j10) {
        Surface surface;
        n nVar = this.b;
        n4.s sVar = nVar.b1;
        if (this != nVar.M1 || nVar.d0 == null) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            nVar.M0 = true;
            return;
        }
        try {
            nVar.C0(j10);
            b2 b2Var = nVar.H1;
            if (!b2Var.equals(b2.d) && !b2Var.equals(nVar.I1)) {
                nVar.I1 = b2Var;
                sVar.J(b2Var);
            }
            nVar.O0.e++;
            a0 a0Var = nVar.e1;
            boolean z10 = a0Var.e != 3;
            a0Var.e = 3;
            a0Var.l.getClass();
            a0Var.g = e2.n0.S(SystemClock.elapsedRealtime());
            if (z10 && (surface = nVar.r1) != null) {
                sVar.E(surface);
                nVar.u1 = true;
            }
            nVar.h0(j10);
        } catch (i2.m e) {
            nVar.N0 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        String str = e2.n0.a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
