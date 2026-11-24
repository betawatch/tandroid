// default package

import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g4 implements s84 {
    public final f4 a = new f4(null, 0, "audio/ac4", (byte) 1);
    public final yw7 b = new yw7(TLObject.FLAG_14);
    public boolean c;

    @Override // s84
    public final int b(t84 t84Var, u21 u21Var) {
        yw7 yw7Var = this.b;
        int read = ((vb3) t84Var).read(yw7Var.a, 0, TLObject.FLAG_14);
        if (read == -1) {
            return -1;
        }
        yw7Var.N(0);
        yw7Var.M(read);
        boolean z = this.c;
        f4 f4Var = this.a;
        if (!z) {
            f4Var.o = 0L;
            this.c = true;
        }
        f4Var.b(yw7Var);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        return false;
     */
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(t84 t84Var) {
        vb3 vb3Var;
        int i;
        yw7 yw7Var = new yw7(10);
        int i2 = 0;
        while (true) {
            vb3Var = (vb3) t84Var;
            vb3Var.d(yw7Var.a, 0, 10, false);
            yw7Var.N(0);
            if (yw7Var.D() != 4801587) {
                break;
            }
            yw7Var.O(3);
            int z = yw7Var.z();
            i2 += z + 10;
            vb3Var.a(z, false);
        }
        vb3Var.f = 0;
        vb3Var.a(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            vb3Var.d(yw7Var.a, 0, 7, false);
            yw7Var.N(0);
            int H = yw7Var.H();
            if (H != 44096 && H != 44097) {
                vb3Var.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                vb3Var.a(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = yw7Var.a;
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
                vb3Var.a(i - 7, false);
            }
        }
    }

    @Override // s84
    public final void d(long j, long j2) {
        this.c = false;
        this.a.d();
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        this.a.h(u84Var, new l4c(0, 1));
        u84Var.B();
        u84Var.f0(new od0(-9223372036854775807L));
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }
}
