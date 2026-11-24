// default package

import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class g4 implements j74 {
    public final f4 a = new f4(null, 0, "audio/ac4", (byte) 1);
    public final xu7 b = new xu7(TLObject.FLAG_14);
    public boolean c;

    @Override // j74
    public final int b(k74 k74Var, m11 m11Var) {
        xu7 xu7Var = this.b;
        int read = ((ja3) k74Var).read(xu7Var.a, 0, TLObject.FLAG_14);
        if (read == -1) {
            return -1;
        }
        xu7Var.N(0);
        xu7Var.M(read);
        boolean z = this.c;
        f4 f4Var = this.a;
        if (!z) {
            f4Var.o = 0L;
            this.c = true;
        }
        f4Var.b(xu7Var);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        return false;
     */
    @Override // j74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(k74 k74Var) {
        ja3 ja3Var;
        int i;
        xu7 xu7Var = new xu7(10);
        int i2 = 0;
        while (true) {
            ja3Var = (ja3) k74Var;
            ja3Var.d(xu7Var.a, 0, 10, false);
            xu7Var.N(0);
            if (xu7Var.D() != 4801587) {
                break;
            }
            xu7Var.O(3);
            int z = xu7Var.z();
            i2 += z + 10;
            ja3Var.a(z, false);
        }
        ja3Var.f = 0;
        ja3Var.a(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            ja3Var.d(xu7Var.a, 0, 7, false);
            xu7Var.N(0);
            int H = xu7Var.H();
            if (H != 44096 && H != 44097) {
                ja3Var.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                ja3Var.a(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = xu7Var.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (H == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                ja3Var.a(i - 7, false);
            }
        }
    }

    @Override // j74
    public final void d(long j, long j2) {
        this.c = false;
        this.a.d();
    }

    @Override // j74
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        this.a.h(l74Var, new l2c(0, 1));
        l74Var.B();
        l74Var.f0(new oc0(-9223372036854775807L));
    }

    @Override // j74
    public final j74 a() {
        return this;
    }

    @Override // j74
    public final void release() {
    }
}
