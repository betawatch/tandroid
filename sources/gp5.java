// default package

import android.content.Context;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gp5 implements bma, m8a {
    public static final gp5 c;
    public static final gp5 d;
    public final /* synthetic */ byte a;
    public boolean b;

    static {
        byte b = 0;
        c = new gp5(b, true);
        d = new gp5(b, false);
    }

    public gp5(iq7 iq7Var, hq7 hq7Var) {
        this.a = (byte) 3;
        byte b = hq7Var.a;
        ByteBuffer byteBuffer = hq7Var.b;
        jte.f(b == 6 || b == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        ye1 ye1Var = new ye1(min, bArr);
        if (iq7Var.a) {
            throw new gq7();
        }
        if (ye1Var.e()) {
            this.b = false;
            return;
        }
        int f = ye1Var.f(2);
        boolean e = ye1Var.e();
        if (iq7Var.b) {
            throw new gq7();
        }
        if (!e) {
            this.b = true;
            return;
        }
        boolean e2 = (f == 3 || f == 0) ? true : ye1Var.e();
        ye1Var.m();
        if (!iq7Var.d) {
            throw new gq7();
        }
        if (ye1Var.e()) {
            if (!iq7Var.e) {
                throw new gq7();
            }
            ye1Var.m();
        }
        if (iq7Var.c) {
            throw new gq7();
        }
        if (f != 3) {
            ye1Var.m();
        }
        ye1Var.n(iq7Var.f);
        if (f != 2 && f != 0 && !e2) {
            ye1Var.n(3);
        }
        this.b = ((f == 3 || f == 0) ? nm7.d4 : ye1Var.f(8)) != 0;
    }

    @Override // m8a
    public final void B(f7a f7aVar, boolean z) {
    }

    @Override // m8a
    public final void C(f7a f7aVar, int i) {
    }

    @Override // m8a
    public final void L(f7a f7aVar, int i) {
    }

    @Override // m8a
    public final void P(f7a f7aVar, String str) {
    }

    @Override // m8a
    public final void R(f7a f7aVar, String str) {
        MediaController w;
        k47 k47Var;
        me1 me1Var = (me1) f7aVar;
        if (me1Var != null) {
            ite.e("Must be called from the main thread.");
            k89 k89Var = me1Var.j;
            if (k89Var == null) {
                return;
            }
            AtomicInteger atomicInteger = fp.b;
            if (atomicInteger != null) {
                atomicInteger.set(0);
            }
            k89Var.p(new oe1());
            ite.e("Must be called from the main thread.");
            if (k89Var.w()) {
                k89.x(new z7d(k89Var, (byte) 3));
            } else {
                k89.t();
            }
            boolean z = this.b;
            long j = -1;
            if (!z) {
                ndc ndcVar = PhotoViewer.r0().G2;
                if (ndcVar != null) {
                    j = ndcVar.S();
                }
            } else if (z && (k47Var = (w = MediaController.w()).v0) != null) {
                j = w.y(k47Var);
            }
            if (j >= 0) {
                fp.x(j);
            }
            fp.d(true);
        }
    }

    public final void a(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
    }

    @Override // m8a
    public final void l(f7a f7aVar, int i) {
        fp.d(false);
        fp.E();
    }

    @Override // m8a
    public final void o(f7a f7aVar) {
    }

    @Override // m8a
    public final void q(f7a f7aVar, int i) {
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("IncorrectFragmentation{expected=");
                sb.append(!this.b);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // m8a
    public final void z(f7a f7aVar) {
        fp.d(false);
        fp.E();
    }

    public /* synthetic */ gp5(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gp5(int i) {
        this.a = (byte) 2;
        this.b = i;
    }

    public gp5(Context context, Looper looper, bfb bfbVar) {
        this.a = (byte) 5;
        new k1f(context.getApplicationContext());
        bfbVar.a(looper, null);
        bfbVar.a(Looper.getMainLooper(), null);
    }

    public /* synthetic */ gp5() {
        this.a = (byte) 1;
    }
}
