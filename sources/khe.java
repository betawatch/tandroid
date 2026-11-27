// default package

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class khe extends b9e implements Cloneable {
    public boolean E;
    public long a;
    public long b;
    public int c;
    public phe[] d;
    public byte[] e;
    public byte[] f;
    public String h;
    public String n;
    public String r;
    public long s;
    public byte[] w;
    public String x;
    public int[] y;

    @Override // b9e
    public final void a(ve9 ve9Var) {
        String str = this.x;
        String str2 = this.r;
        String str3 = this.n;
        String str4 = this.h;
        byte[] bArr = this.e;
        long j = this.a;
        if (j != 0) {
            ve9Var.m0(1, 0);
            ve9Var.o0(j);
        }
        phe[] pheVarArr = this.d;
        if (pheVarArr != null && pheVarArr.length > 0) {
            int i = 0;
            while (true) {
                phe[] pheVarArr2 = this.d;
                if (i >= pheVarArr2.length) {
                    break;
                }
                phe pheVar = pheVarArr2[i];
                i++;
            }
        }
        byte[] bArr2 = njd.b;
        if (!Arrays.equals(bArr, bArr2)) {
            ve9Var.g0(4, bArr);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            ve9Var.g0(6, this.f);
        }
        if (str4 != null && !str4.equals("")) {
            ve9Var.f0(8, str4);
        }
        int i2 = this.c;
        if (i2 != 0) {
            ve9Var.m0(11, 0);
            if (i2 >= 0) {
                ve9Var.k0(i2);
            } else {
                ve9Var.o0(i2);
            }
        }
        if (str3 != null && !str3.equals("")) {
            ve9Var.f0(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            ve9Var.f0(14, str2);
        }
        long j2 = this.s;
        if (j2 != 180000) {
            ve9Var.m0(15, 0);
            ve9Var.o0((j2 << 1) ^ (j2 >> 63));
        }
        long j3 = this.b;
        if (j3 != 0) {
            ve9Var.m0(17, 0);
            ve9Var.o0(j3);
        }
        if (!Arrays.equals(this.w, bArr2)) {
            ve9Var.g0(18, this.w);
        }
        int[] iArr = this.y;
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.y;
                if (i3 >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i3];
                ve9Var.m0(20, 0);
                if (i4 >= 0) {
                    ve9Var.k0(i4);
                } else {
                    ve9Var.o0(i4);
                }
                i3++;
            }
        }
        if (str != null && !str.equals("")) {
            ve9Var.f0(24, str);
        }
        boolean z = this.E;
        if (z) {
            ve9Var.m0(25, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = (ByteBuffer) ve9Var.b;
            if (!byteBuffer.hasRemaining()) {
                throw new wk2(byteBuffer.position(), byteBuffer.limit());
            }
            byteBuffer.put(b);
        }
    }

    public final Object clone() {
        try {
            khe kheVar = (khe) d();
            phe[] pheVarArr = this.d;
            if (pheVarArr != null && pheVarArr.length > 0) {
                kheVar.d = new phe[pheVarArr.length];
                int i = 0;
                while (true) {
                    phe[] pheVarArr2 = this.d;
                    if (i >= pheVarArr2.length) {
                        break;
                    }
                    phe pheVar = pheVarArr2[i];
                    i++;
                }
            }
            int[] iArr = this.y;
            if (iArr != null && iArr.length > 0) {
                kheVar.y = (int[]) iArr.clone();
            }
            return kheVar;
        } catch (CloneNotSupportedException e) {
            hz6.e(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof khe)) {
            return false;
        }
        khe kheVar = (khe) obj;
        if (this.a != kheVar.a || this.b != kheVar.b || this.c != kheVar.c) {
            return false;
        }
        phe[] pheVarArr = this.d;
        phe[] pheVarArr2 = kheVar.d;
        Object obj2 = z9e.a;
        int length = pheVarArr == null ? 0 : pheVarArr.length;
        int length2 = pheVarArr2 == null ? 0 : pheVarArr2.length;
        int i = 0;
        while (i < length) {
            phe pheVar = pheVarArr[i];
            i++;
        }
        int i2 = 0;
        while (i2 < length2) {
            phe pheVar2 = pheVarArr2[i2];
            i2++;
        }
        boolean z = i >= length;
        boolean z2 = i2 >= length2;
        if (!z || !z2) {
            if (z != z2) {
                return false;
            }
            phe pheVar3 = pheVarArr[i];
            phe pheVar4 = pheVarArr2[i2];
            throw null;
        }
        if (!Arrays.equals(this.e, kheVar.e) || !Arrays.equals(this.f, kheVar.f)) {
            return false;
        }
        String str = this.h;
        String str2 = kheVar.h;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        String str3 = this.n;
        String str4 = kheVar.n;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        String str5 = this.r;
        String str6 = kheVar.r;
        if (str5 == null) {
            if (str6 != null) {
                return false;
            }
        } else if (!str5.equals(str6)) {
            return false;
        }
        if (this.s != kheVar.s || !Arrays.equals(this.w, kheVar.w)) {
            return false;
        }
        String str7 = this.x;
        String str8 = kheVar.x;
        if (str7 == null) {
            if (str8 != null) {
                return false;
            }
        } else if (!str7.equals(str8)) {
            return false;
        }
        int[] iArr = this.y;
        int[] iArr2 = kheVar.y;
        return ((iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2)) && this.E == kheVar.E;
    }

    public final int hashCode() {
        int hashCode = (khe.class.getName().hashCode() + 527) * 31;
        long j = this.a;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.b;
        int i2 = ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 29791) + this.c) * 29791) + 1237;
        phe[] pheVarArr = this.d;
        Object obj = z9e.a;
        int i3 = 0;
        int length = pheVarArr == null ? 0 : pheVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            phe pheVar = pheVarArr[i4];
        }
        int hashCode2 = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + (i2 * 961)) * 961)) * 31;
        String str = this.h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.r;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        long j3 = this.s;
        int hashCode6 = (Arrays.hashCode(this.w) + ((((hashCode4 + hashCode5) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 961)) * 31;
        String str4 = this.x;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 961;
        int[] iArr = this.y;
        if (iArr != null && iArr.length != 0) {
            i3 = Arrays.hashCode(iArr);
        }
        return (((hashCode7 + i3) * 29791) + (this.E ? 1231 : 1237)) * 31;
    }
}
