// default package

import android.content.Context;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gn5 implements aka, k6a {
    public static final gn5 c;
    public static final gn5 d;
    public final /* synthetic */ byte a;
    public boolean b;

    static {
        byte b = 0;
        c = new gn5(b, true);
        d = new gn5(b, false);
    }

    public gn5(fo7 fo7Var, eo7 eo7Var) {
        this.a = (byte) 3;
        byte b = eo7Var.a;
        ByteBuffer byteBuffer = eo7Var.b;
        gre.f(b == 6 || b == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        qd1 qd1Var = new qd1(min, bArr);
        if (fo7Var.a) {
            throw new do7();
        }
        if (qd1Var.e()) {
            this.b = false;
            return;
        }
        int f = qd1Var.f(2);
        boolean e = qd1Var.e();
        if (fo7Var.b) {
            throw new do7();
        }
        if (!e) {
            this.b = true;
            return;
        }
        boolean e2 = (f == 3 || f == 0) ? true : qd1Var.e();
        qd1Var.m();
        if (!fo7Var.d) {
            throw new do7();
        }
        if (qd1Var.e()) {
            if (!fo7Var.e) {
                throw new do7();
            }
            qd1Var.m();
        }
        if (fo7Var.c) {
            throw new do7();
        }
        if (f != 3) {
            qd1Var.m();
        }
        qd1Var.n(fo7Var.f);
        if (f != 2 && f != 0 && !e2) {
            qd1Var.n(3);
        }
        this.b = ((f == 3 || f == 0) ? kk7.d4 : qd1Var.f(8)) != 0;
    }

    @Override // k6a
    public final void E(d5a d5aVar, boolean z) {
    }

    @Override // k6a
    public final void F(d5a d5aVar, int i) {
    }

    @Override // k6a
    public final void K(d5a d5aVar, int i) {
    }

    @Override // k6a
    public final void R(d5a d5aVar, String str) {
    }

    @Override // k6a
    public final void T(d5a d5aVar, String str) {
        MediaController w;
        k27 k27Var;
        ed1 ed1Var = (ed1) d5aVar;
        if (ed1Var != null) {
            fre.e("Must be called from the main thread.");
            i69 i69Var = ed1Var.j;
            if (i69Var == null) {
                return;
            }
            AtomicInteger atomicInteger = fo.b;
            if (atomicInteger != null) {
                atomicInteger.set(0);
            }
            i69Var.p(new gd1());
            fre.e("Must be called from the main thread.");
            if (i69Var.w()) {
                i69.x(new x5d(i69Var, (byte) 3));
            } else {
                i69.t();
            }
            boolean z = this.b;
            long j = -1;
            if (!z) {
                lbc lbcVar = PhotoViewer.r0().G2;
                if (lbcVar != null) {
                    j = lbcVar.S();
                }
            } else if (z && (k27Var = (w = MediaController.w()).v0) != null) {
                j = w.y(k27Var);
            }
            if (j >= 0) {
                fo.x(j);
            }
            fo.d(true);
        }
    }

    public final void a(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
    }

    @Override // k6a
    public final void n(d5a d5aVar, int i) {
        fo.d(false);
        fo.E();
    }

    @Override // k6a
    public final void p(d5a d5aVar) {
    }

    @Override // k6a
    public final void q(d5a d5aVar, int i) {
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

    @Override // k6a
    public final void z(d5a d5aVar) {
        fo.d(false);
        fo.E();
    }

    public /* synthetic */ gn5(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gn5(int i) {
        this.a = (byte) 2;
        this.b = i;
    }

    public gn5(Context context, Looper looper, adb adbVar) {
        this.a = (byte) 5;
        new ize(context.getApplicationContext());
        adbVar.a(looper, null);
        adbVar.a(Looper.getMainLooper(), null);
    }

    public /* synthetic */ gn5() {
        this.a = (byte) 1;
    }
}
