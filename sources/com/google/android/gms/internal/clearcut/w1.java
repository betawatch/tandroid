package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w1 extends n1 implements Cloneable {
    public boolean D;
    public long a;
    public long b;
    public int c;
    public x1[] d;
    public byte[] e;
    public byte[] f;
    public String h;
    public String n;
    public String r;
    public long s;
    public byte[] w;
    public String x;
    public int[] y;

    @Override // com.google.android.gms.internal.clearcut.n1
    public final void a(aa.n nVar) {
        String str = this.x;
        String str2 = this.r;
        String str3 = this.n;
        String str4 = this.h;
        byte[] bArr = this.e;
        long j3 = this.a;
        if (j3 != 0) {
            nVar.x(1, 0);
            nVar.z(j3);
        }
        x1[] x1VarArr = this.d;
        if (x1VarArr != null && x1VarArr.length > 0) {
            int i7 = 0;
            while (true) {
                x1[] x1VarArr2 = this.d;
                if (i7 >= x1VarArr2.length) {
                    break;
                }
                x1 x1Var = x1VarArr2[i7];
                i7++;
            }
        }
        byte[] bArr2 = m1.d;
        if (!Arrays.equals(bArr, bArr2)) {
            nVar.s(4, bArr);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            nVar.s(6, this.f);
        }
        if (str4 != null && !str4.equals("")) {
            nVar.r(8, str4);
        }
        int i10 = this.c;
        if (i10 != 0) {
            nVar.x(11, 0);
            if (i10 >= 0) {
                nVar.u(i10);
            } else {
                nVar.z(i10);
            }
        }
        if (str3 != null && !str3.equals("")) {
            nVar.r(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            nVar.r(14, str2);
        }
        long j10 = this.s;
        if (j10 != 180000) {
            nVar.x(15, 0);
            nVar.z((j10 >> 63) ^ (j10 << 1));
        }
        long j11 = this.b;
        if (j11 != 0) {
            nVar.x(17, 0);
            nVar.z(j11);
        }
        if (!Arrays.equals(this.w, bArr2)) {
            nVar.s(18, this.w);
        }
        int[] iArr = this.y;
        if (iArr != null && iArr.length > 0) {
            int i11 = 0;
            while (true) {
                int[] iArr2 = this.y;
                if (i11 >= iArr2.length) {
                    break;
                }
                int i12 = iArr2[i11];
                nVar.x(20, 0);
                if (i12 >= 0) {
                    nVar.u(i12);
                } else {
                    nVar.z(i12);
                }
                i11++;
            }
        }
        if (str != null && !str.equals("")) {
            nVar.r(24, str);
        }
        boolean z9 = this.D;
        if (z9) {
            nVar.x(25, 0);
            byte b10 = z9 ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = (ByteBuffer) nVar.b;
            if (!byteBuffer.hasRemaining()) {
                throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
            }
            byteBuffer.put(b10);
        }
    }

    public final Object clone() {
        try {
            w1 w1Var = (w1) d();
            x1[] x1VarArr = this.d;
            if (x1VarArr != null && x1VarArr.length > 0) {
                w1Var.d = new x1[x1VarArr.length];
                int i7 = 0;
                while (true) {
                    x1[] x1VarArr2 = this.d;
                    if (i7 >= x1VarArr2.length) {
                        break;
                    }
                    x1 x1Var = x1VarArr2[i7];
                    i7++;
                }
            }
            int[] iArr = this.y;
            if (iArr != null && iArr.length > 0) {
                w1Var.y = (int[]) iArr.clone();
            }
            return w1Var;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj != this) {
            if (obj instanceof w1) {
                w1 w1Var = (w1) obj;
                String str5 = w1Var.x;
                String str6 = w1Var.r;
                String str7 = w1Var.n;
                String str8 = w1Var.h;
                if (this.a == w1Var.a && this.b == w1Var.b && this.c == w1Var.c) {
                    x1[] x1VarArr = this.d;
                    x1[] x1VarArr2 = w1Var.d;
                    Object obj2 = o1.a;
                    int length = x1VarArr == null ? 0 : x1VarArr.length;
                    int length2 = x1VarArr2 == null ? 0 : x1VarArr2.length;
                    int i7 = 0;
                    while (i7 < length) {
                        x1 x1Var = x1VarArr[i7];
                        i7++;
                    }
                    int i10 = 0;
                    while (i10 < length2) {
                        x1 x1Var2 = x1VarArr2[i10];
                        i10++;
                    }
                    boolean z9 = i7 >= length;
                    boolean z10 = i10 >= length2;
                    if (z9 && z10) {
                        if (Arrays.equals(this.e, w1Var.e) && Arrays.equals(this.f, w1Var.f) && ((str = this.h) != null ? str.equals(str8) : str8 == null) && ((str2 = this.n) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.r) != null ? str3.equals(str6) : str6 == null) && this.s == w1Var.s && Arrays.equals(this.w, w1Var.w) && ((str4 = this.x) != null ? str4.equals(str5) : str5 == null)) {
                            int[] iArr = this.y;
                            int[] iArr2 = w1Var.y;
                            if (((iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2)) && this.D == w1Var.D) {
                            }
                        }
                    } else if (z9 == z10) {
                        x1 x1Var3 = x1VarArr[i7];
                        x1 x1Var4 = x1VarArr2[i10];
                        throw null;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (w1.class.getName().hashCode() + 527) * 31;
        long j3 = this.a;
        int i7 = (hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j10 = this.b;
        int i10 = ((((i7 + ((int) (j10 ^ (j10 >>> 32)))) * 29791) + this.c) * 29791) + 1237;
        x1[] x1VarArr = this.d;
        Object obj = o1.a;
        int i11 = 0;
        int length = x1VarArr == null ? 0 : x1VarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            x1 x1Var = x1VarArr[i12];
        }
        int hashCode2 = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + (i10 * 961)) * 961)) * 31;
        String str = this.h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.r;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        long j11 = this.s;
        int hashCode6 = (Arrays.hashCode(this.w) + ((((hashCode4 + hashCode5) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 961)) * 31;
        String str4 = this.x;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 961;
        int[] iArr = this.y;
        if (iArr != null && iArr.length != 0) {
            i11 = Arrays.hashCode(iArr);
        }
        return (((hashCode7 + i11) * 29791) + (this.D ? 1231 : 1237)) * 31;
    }
}
