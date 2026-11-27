// default package

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class gwc implements e84 {
    public g84 a;
    public x1c b;
    public byte c;
    public long d;
    public ewc e;
    public int f;
    public long g;

    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0240  */
    @Override // e84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(f84 f84Var, v11 v11Var) {
        byte[] bArr;
        int i;
        int i2;
        byte[] bArr2;
        int F;
        int i3;
        this.b.getClass();
        String str = gcc.a;
        byte b = this.c;
        if (b == 0) {
            yve.p(((cb3) f84Var).d == 0);
            int i4 = this.f;
            if (i4 != -1) {
                ((cb3) f84Var).l(i4, false);
                this.c = (byte) 4;
                return 0;
            }
            cb3 cb3Var = (cb3) f84Var;
            if (!did.a(cb3Var)) {
                throw hy7.a("Unsupported or unrecognized wav file type.", null);
            }
            cb3Var.l((int) (cb3Var.e() - cb3Var.d), false);
            this.c = (byte) 1;
            return 0;
        }
        long j = -1;
        if (b == 1) {
            ey7 ey7Var = new ey7(8);
            hwc a = hwc.a((cb3) f84Var, ey7Var);
            if (a.a != 1685272116) {
                ((cb3) f84Var).f = 0;
            } else {
                cb3 cb3Var2 = (cb3) f84Var;
                cb3Var2.a(8, false);
                ey7Var.N(0);
                cb3Var2.d(ey7Var.a, 0, 8, false);
                j = ey7Var.p();
                cb3Var2.l(((int) a.b) + 8, false);
            }
            this.d = j;
            this.c = (byte) 2;
            return 0;
        }
        if (b != 2) {
            if (b != 3) {
                if (b != 4) {
                    grb.g();
                    return 0;
                }
                yve.p(this.g != -1);
                long j2 = this.g - ((cb3) f84Var).d;
                ewc ewcVar = this.e;
                ewcVar.getClass();
                return ewcVar.a((cb3) f84Var, j2) ? -1 : 0;
            }
            ((cb3) f84Var).f = 0;
            cb3 cb3Var3 = (cb3) f84Var;
            hwc b2 = did.b(1684108385, cb3Var3, new ey7(8));
            cb3Var3.l(8, false);
            Pair create = Pair.create(Long.valueOf(cb3Var3.d), Long.valueOf(b2.b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j3 = this.d;
            if (j3 != -1 && longValue == 4294967295L) {
                longValue = j3;
            }
            long j4 = this.f + longValue;
            this.g = j4;
            long j5 = cb3Var3.c;
            if (j5 != -1 && j4 > j5) {
                efd.f("WavExtractor", "Data exceeds input length: " + this.g + ", " + j5);
                this.g = j5;
            }
            ewc ewcVar2 = this.e;
            ewcVar2.getClass();
            ewcVar2.c(this.f, this.g);
            this.c = (byte) 4;
            return 0;
        }
        ey7 ey7Var2 = new ey7(16);
        long j6 = did.b(1718449184, (cb3) f84Var, ey7Var2).b;
        yve.p(j6 >= 16);
        cb3 cb3Var4 = (cb3) f84Var;
        cb3Var4.d(ey7Var2.a, 0, 16, false);
        ey7Var2.N(0);
        int t = ey7Var2.t();
        int t2 = ey7Var2.t();
        int s = ey7Var2.s();
        ey7Var2.s();
        int t3 = ey7Var2.t();
        int t4 = ey7Var2.t();
        int i5 = ((int) j6) - 16;
        if (i5 > 0) {
            bArr = new byte[i5];
            cb3Var4.d(bArr, 0, i5, false);
            if (t == 65534 && i5 == 24) {
                ey7 ey7Var3 = new ey7(bArr);
                ey7Var3.t();
                int t5 = ey7Var3.t();
                if (t5 != 0 && t5 != t4) {
                    throw hy7.d("validBits ( " + t5 + ")  != bitsPerSample( " + t4 + ") are not supported");
                }
                int s2 = ey7Var3.s();
                if ((s2 >> 18) != 0 || (s2 != 0 && Integer.bitCount(s2) != t2)) {
                    throw hy7.d("Channel mask " + s2 + " is invalid or does not match channel count " + t2);
                }
                int t6 = ey7Var3.t();
                byte[] bArr3 = new byte[14];
                ey7Var3.k(0, 14, bArr3);
                if (!Arrays.equals(bArr3, did.a) && !Arrays.equals(bArr3, did.b)) {
                    throw hy7.d("invalid wav format extension guid");
                }
                i2 = s2;
                bArr2 = bArr;
                i = t6;
                cb3Var4.l((int) (cb3Var4.e() - cb3Var4.d), false);
                go9 go9Var = new go9(i, t2, s, t3, t4, i2, bArr2);
                if (i != 17) {
                    this.e = new dwc(this.a, this.b, go9Var);
                } else if (i == 6) {
                    this.e = new fwc(this.a, this.b, go9Var, "audio/g711-alaw", -1);
                } else if (i == 7) {
                    this.e = new fwc(this.a, this.b, go9Var, "audio/g711-mlaw", -1);
                } else {
                    if (i != 1) {
                        if (i == 3) {
                            F = gcc.C(t4, ByteOrder.LITTLE_ENDIAN);
                            i3 = F;
                            if (i3 == 0) {
                            }
                        } else if (i != 65534) {
                            i3 = 0;
                            if (i3 == 0) {
                                throw hy7.d("Unsupported WAV format type: " + i);
                            }
                            this.e = new fwc(this.a, this.b, go9Var, "audio/raw", i3);
                        }
                    }
                    F = gcc.F(t4, ByteOrder.LITTLE_ENDIAN);
                    i3 = F;
                    if (i3 == 0) {
                    }
                }
                this.c = (byte) 3;
                return 0;
            }
        } else {
            bArr = gcc.b;
        }
        i = t;
        i2 = 0;
        bArr2 = bArr;
        cb3Var4.l((int) (cb3Var4.e() - cb3Var4.d), false);
        go9 go9Var2 = new go9(i, t2, s, t3, t4, i2, bArr2);
        if (i != 17) {
        }
        this.c = (byte) 3;
        return 0;
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        return did.a((cb3) f84Var);
    }

    @Override // e84
    public final void d(long j, long j2) {
        this.c = j == 0 ? (byte) 0 : (byte) 4;
        ewc ewcVar = this.e;
        if (ewcVar != null) {
            ewcVar.b(j2);
        }
    }

    @Override // e84
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        this.a = g84Var;
        this.b = g84Var.e0(0, 1);
        g84Var.D();
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }
}
