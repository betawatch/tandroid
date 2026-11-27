// default package

import android.content.Context;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class jp5 implements una, caa {
    public static final jp5 c;
    public static final jp5 d;
    public final /* synthetic */ byte a;
    public boolean b;

    static {
        byte b = 0;
        c = new jp5(b, true);
        d = new jp5(b, false);
    }

    public jp5(fr7 fr7Var, er7 er7Var) {
        this.a = (byte) 3;
        byte b = er7Var.a;
        ByteBuffer byteBuffer = er7Var.b;
        yve.f(b == 6 || b == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        zd1 zd1Var = new zd1(min, bArr);
        if (fr7Var.a) {
            throw new dr7();
        }
        if (zd1Var.e()) {
            this.b = false;
            return;
        }
        int f = zd1Var.f(2);
        boolean e = zd1Var.e();
        if (fr7Var.b) {
            throw new dr7();
        }
        if (!e) {
            this.b = true;
            return;
        }
        boolean e2 = (f == 3 || f == 0) ? true : zd1Var.e();
        zd1Var.m();
        if (!fr7Var.d) {
            throw new dr7();
        }
        if (zd1Var.e()) {
            if (!fr7Var.e) {
                throw new dr7();
            }
            zd1Var.m();
        }
        if (fr7Var.c) {
            throw new dr7();
        }
        if (f != 3) {
            zd1Var.m();
        }
        zd1Var.n(fr7Var.f);
        if (f != 2 && f != 0 && !e2) {
            zd1Var.n(3);
        }
        this.b = ((f == 3 || f == 0) ? jn7.d4 : zd1Var.f(8)) != 0;
    }

    @Override // caa
    public final void B(v8a v8aVar) {
        go.d(false);
        go.E();
    }

    @Override // caa
    public final void C(v8a v8aVar, boolean z) {
    }

    @Override // caa
    public final void D(v8a v8aVar, int i) {
    }

    @Override // caa
    public final void J(v8a v8aVar, int i) {
    }

    @Override // caa
    public final void N(v8a v8aVar, String str) {
    }

    @Override // caa
    public final void P(v8a v8aVar, String str) {
        MediaController z;
        r47 r47Var;
        md1 md1Var = (md1) v8aVar;
        if (md1Var != null) {
            xve.e("Must be called from the main thread.");
            v99 v99Var = md1Var.j;
            if (v99Var == null) {
                return;
            }
            AtomicInteger atomicInteger = go.b;
            if (atomicInteger != null) {
                atomicInteger.set(0);
            }
            v99Var.p(new od1());
            xve.e("Must be called from the main thread.");
            if (v99Var.w()) {
                v99.x(new qad(v99Var, (byte) 3));
            } else {
                v99.t();
            }
            boolean z2 = this.b;
            long j = -1;
            if (!z2) {
                kfc kfcVar = PhotoViewer.q0().G2;
                if (kfcVar != null) {
                    j = kfcVar.S();
                }
            } else if (z2 && (r47Var = (z = MediaController.z()).v0) != null) {
                j = z.B(r47Var);
            }
            if (j >= 0) {
                go.x(j);
            }
            go.d(true);
        }
    }

    public final void a(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
    }

    @Override // caa
    public final void m(v8a v8aVar, int i) {
        go.d(false);
        go.E();
    }

    @Override // caa
    public final void n(v8a v8aVar) {
    }

    @Override // caa
    public final void p(v8a v8aVar, int i) {
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

    public /* synthetic */ jp5(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jp5(int i) {
        this.a = (byte) 2;
        this.b = i;
    }

    public jp5(Context context, Looper looper, vgb vgbVar) {
        this.a = (byte) 5;
        new z6f(context.getApplicationContext());
        vgbVar.a(looper, null);
        vgbVar.a(Looper.getMainLooper(), null);
    }

    public /* synthetic */ jp5() {
        this.a = (byte) 1;
    }
}
