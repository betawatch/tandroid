// default package

import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class h4 implements e84 {
    public final g4 a = new g4(null, 0, "audio/ac4", (byte) 1);
    public final ey7 b = new ey7(TLObject.FLAG_14);
    public boolean c;

    @Override // e84
    public final int b(f84 f84Var, v11 v11Var) {
        ey7 ey7Var = this.b;
        int read = ((cb3) f84Var).read(ey7Var.a, 0, TLObject.FLAG_14);
        if (read == -1) {
            return -1;
        }
        ey7Var.N(0);
        ey7Var.M(read);
        boolean z = this.c;
        g4 g4Var = this.a;
        if (!z) {
            g4Var.o = 0L;
            this.c = true;
        }
        g4Var.b(ey7Var);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        return false;
     */
    @Override // e84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(f84 f84Var) {
        cb3 cb3Var;
        int i;
        ey7 ey7Var = new ey7(10);
        int i2 = 0;
        while (true) {
            cb3Var = (cb3) f84Var;
            cb3Var.d(ey7Var.a, 0, 10, false);
            ey7Var.N(0);
            if (ey7Var.D() != 4801587) {
                break;
            }
            ey7Var.O(3);
            int z = ey7Var.z();
            i2 += z + 10;
            cb3Var.a(z, false);
        }
        cb3Var.f = 0;
        cb3Var.a(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            cb3Var.d(ey7Var.a, 0, 7, false);
            ey7Var.N(0);
            int H = ey7Var.H();
            if (H != 44096 && H != 44097) {
                cb3Var.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                cb3Var.a(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = ey7Var.a;
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
                cb3Var.a(i - 7, false);
            }
        }
    }

    @Override // e84
    public final void d(long j, long j2) {
        this.c = false;
        this.a.d();
    }

    @Override // e84
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        this.a.h(g84Var, new l6c(0, 1));
        g84Var.D();
        g84Var.m0(new qc0(-9223372036854775807L));
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }
}
