package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.cast.z4;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w1 extends n1 implements Cloneable {
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
    public byte[] v;
    public String w;
    public int[] x;
    public boolean y;

    @Override // com.google.android.gms.internal.clearcut.n1
    public final void a(a6.i iVar) {
        String str = this.w;
        String str2 = this.r;
        String str3 = this.n;
        String str4 = this.h;
        byte[] bArr = this.e;
        long j10 = this.a;
        if (j10 != 0) {
            iVar.C(1, 0);
            iVar.E(j10);
        }
        x1[] x1VarArr = this.d;
        if (x1VarArr != null && x1VarArr.length > 0) {
            int i10 = 0;
            while (true) {
                x1[] x1VarArr2 = this.d;
                if (i10 >= x1VarArr2.length) {
                    break;
                }
                x1 x1Var = x1VarArr2[i10];
                i10++;
            }
        }
        byte[] bArr2 = m1.d;
        if (!Arrays.equals(bArr, bArr2)) {
            iVar.x(4, bArr);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            iVar.x(6, this.f);
        }
        if (str4 != null && !str4.equals("")) {
            iVar.w(8, str4);
        }
        int i11 = this.c;
        if (i11 != 0) {
            iVar.C(11, 0);
            if (i11 >= 0) {
                iVar.A(i11);
            } else {
                iVar.E(i11);
            }
        }
        if (str3 != null && !str3.equals("")) {
            iVar.w(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            iVar.w(14, str2);
        }
        long j11 = this.s;
        if (j11 != 180000) {
            iVar.C(15, 0);
            iVar.E((j11 >> 63) ^ (j11 << 1));
        }
        long j12 = this.b;
        if (j12 != 0) {
            iVar.C(17, 0);
            iVar.E(j12);
        }
        if (!Arrays.equals(this.v, bArr2)) {
            iVar.x(18, this.v);
        }
        int[] iArr = this.x;
        if (iArr != null && iArr.length > 0) {
            int i12 = 0;
            while (true) {
                int[] iArr2 = this.x;
                if (i12 >= iArr2.length) {
                    break;
                }
                int i13 = iArr2[i12];
                iVar.C(20, 0);
                if (i13 >= 0) {
                    iVar.A(i13);
                } else {
                    iVar.E(i13);
                }
                i12++;
            }
        }
        if (str != null && !str.equals("")) {
            iVar.w(24, str);
        }
        boolean z10 = this.y;
        if (z10) {
            iVar.C(25, 0);
            byte b10 = z10 ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = (ByteBuffer) iVar.b;
            if (!byteBuffer.hasRemaining()) {
                throw new z4(byteBuffer.position(), byteBuffer.limit());
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
                int i10 = 0;
                while (true) {
                    x1[] x1VarArr2 = this.d;
                    if (i10 >= x1VarArr2.length) {
                        break;
                    }
                    x1 x1Var = x1VarArr2[i10];
                    i10++;
                }
            }
            int[] iArr = this.x;
            if (iArr != null && iArr.length > 0) {
                w1Var.x = (int[]) iArr.clone();
            }
            return w1Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
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
                String str5 = w1Var.w;
                String str6 = w1Var.r;
                String str7 = w1Var.n;
                String str8 = w1Var.h;
                if (this.a == w1Var.a && this.b == w1Var.b && this.c == w1Var.c) {
                    x1[] x1VarArr = this.d;
                    x1[] x1VarArr2 = w1Var.d;
                    Object obj2 = o1.a;
                    int length = x1VarArr == null ? 0 : x1VarArr.length;
                    int length2 = x1VarArr2 == null ? 0 : x1VarArr2.length;
                    int i10 = 0;
                    while (i10 < length) {
                        x1 x1Var = x1VarArr[i10];
                        i10++;
                    }
                    int i11 = 0;
                    while (i11 < length2) {
                        x1 x1Var2 = x1VarArr2[i11];
                        i11++;
                    }
                    boolean z10 = i10 >= length;
                    boolean z11 = i11 >= length2;
                    if (z10 && z11) {
                        if (Arrays.equals(this.e, w1Var.e) && Arrays.equals(this.f, w1Var.f) && ((str = this.h) != null ? str.equals(str8) : str8 == null) && ((str2 = this.n) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.r) != null ? str3.equals(str6) : str6 == null) && this.s == w1Var.s && Arrays.equals(this.v, w1Var.v) && ((str4 = this.w) != null ? str4.equals(str5) : str5 == null)) {
                            int[] iArr = this.x;
                            int[] iArr2 = w1Var.x;
                            if (((iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2)) && this.y == w1Var.y) {
                            }
                        }
                    } else if (z10 == z11) {
                        x1 x1Var3 = x1VarArr[i10];
                        x1 x1Var4 = x1VarArr2[i11];
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
        long j10 = this.a;
        int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.b;
        int i11 = ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 29791) + this.c) * 29791) + 1237;
        x1[] x1VarArr = this.d;
        Object obj = o1.a;
        int i12 = 0;
        int length = x1VarArr == null ? 0 : x1VarArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            x1 x1Var = x1VarArr[i13];
        }
        int hashCode2 = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + (i11 * 961)) * 961)) * 31;
        String str = this.h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.r;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        long j12 = this.s;
        int hashCode6 = (Arrays.hashCode(this.v) + ((((hashCode4 + hashCode5) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 961)) * 31;
        String str4 = this.w;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 961;
        int[] iArr = this.x;
        if (iArr != null && iArr.length != 0) {
            i12 = Arrays.hashCode(iArr);
        }
        return (((hashCode7 + i12) * 29791) + (this.y ? 1231 : 1237)) * 31;
    }
}
