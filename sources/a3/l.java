package a3;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import b2.x1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class l implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ m b;

    public l(m mVar, r2.l lVar) {
        this.b = mVar;
        Handler o9 = e2.d0.o(this);
        this.a = o9;
        lVar.d(this, o9);
    }

    public final void a(long j3) {
        Surface surface;
        m mVar = this.b;
        if (this != mVar.H1 || mVar.b0 == null) {
            return;
        }
        if (j3 == Long.MAX_VALUE) {
            mVar.M0 = true;
            return;
        }
        try {
            pf.b bVar = mVar.Z0;
            mVar.x0(j3);
            x1 x1Var = mVar.C1;
            if (!x1Var.equals(x1.d) && !x1Var.equals(mVar.D1)) {
                mVar.D1 = x1Var;
                bVar.k0(x1Var);
            }
            mVar.O0.e++;
            z zVar = mVar.c1;
            boolean z10 = zVar.e != 3;
            zVar.e = 3;
            zVar.l.getClass();
            zVar.g = e2.d0.Q(SystemClock.elapsedRealtime());
            if (z10 && (surface = mVar.n1) != null) {
                Handler handler = (Handler) bVar.b;
                if (handler != null) {
                    handler.post(new g0(bVar, surface, SystemClock.elapsedRealtime(), 0));
                }
                mVar.q1 = true;
            }
            mVar.c0(j3);
        } catch (i2.o e7) {
            mVar.N0 = e7;
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
