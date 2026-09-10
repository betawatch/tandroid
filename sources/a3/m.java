package a3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import b2.x1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class m implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ n b;

    public m(n nVar, r2.l lVar) {
        this.b = nVar;
        Handler o9 = e2.d0.o(this);
        this.a = o9;
        lVar.d(this, o9);
    }

    public final void a(long j3) {
        Surface surface;
        n nVar = this.b;
        if (this != nVar.H1 || nVar.b0 == null) {
            return;
        }
        if (j3 == Long.MAX_VALUE) {
            nVar.M0 = true;
            return;
        }
        try {
            of.b bVar = nVar.Z0;
            nVar.y0(j3);
            x1 x1Var = nVar.C1;
            if (!x1Var.equals(x1.d) && !x1Var.equals(nVar.D1)) {
                nVar.D1 = x1Var;
                bVar.r0(x1Var);
            }
            nVar.O0.e++;
            a0 a0Var = nVar.c1;
            boolean z10 = a0Var.e != 3;
            a0Var.e = 3;
            a0Var.l.getClass();
            a0Var.g = e2.d0.Q(SystemClock.elapsedRealtime());
            if (z10 && (surface = nVar.n1) != null) {
                bVar.n0(surface);
                nVar.q1 = true;
            }
            nVar.d0(j3);
        } catch (i2.n e) {
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
        String str = e2.d0.a;
        a(((i10 & 4294967295L) << 32) | (4294967295L & i11));
        return true;
    }
}
