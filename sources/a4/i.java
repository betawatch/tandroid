package a4;

import e2.q0;
import e2.s0;
import e2.t;
import e2.u;
import h2.x;
import h9.i0;
import i2.o;
import java.util.ArrayList;
import java.util.Arrays;
import q4.q;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class i extends j {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(x xVar, byte[] bArr) {
        if (xVar.a() < bArr.length) {
            return false;
        }
        int i7 = xVar.b;
        byte[] bArr2 = new byte[bArr.length];
        xVar.k(0, bArr.length, bArr2);
        xVar.N(i7);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // a4.j
    public final long b(x xVar) {
        byte[] bArr = xVar.a;
        return (this.i * o.e(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // a4.j
    public final boolean c(x xVar, long j3, q qVar) {
        if (e(xVar, o)) {
            byte[] copyOf = Arrays.copyOf(xVar.a, xVar.c);
            int i7 = copyOf[9] & 255;
            ArrayList a10 = o.a(copyOf);
            if (((u) qVar.b) == null) {
                t tVar = new t();
                tVar.q = s0.n("audio/ogg");
                tVar.r = s0.n("audio/opus");
                tVar.J = i7;
                tVar.K = 48000;
                tVar.u = a10;
                qVar.b = new u(tVar);
                return true;
            }
        } else {
            if (!e(xVar, p)) {
                ((u) qVar.b).getClass();
                return false;
            }
            ((u) qVar.b).getClass();
            if (!this.n) {
                this.n = true;
                xVar.O(8);
                q0 r10 = f3.b.r(i0.r(f3.b.u(xVar, false, false).a));
                if (r10 != null) {
                    t a11 = ((u) qVar.b).a();
                    a11.k = r10.b(((u) qVar.b).l);
                    qVar.b = new u(a11);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // a4.j
    public final void d(boolean z9) {
        super.d(z9);
        if (z9) {
            this.n = false;
        }
    }
}
