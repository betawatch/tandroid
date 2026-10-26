package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.cast.w4;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v1 extends m1 implements Cloneable {
    public long a;
    public long b;
    public int c;
    public w1[] d;
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

    @Override // com.google.android.gms.internal.clearcut.m1
    public final void b(rb.c cVar) {
        String str = this.w;
        String str2 = this.r;
        String str3 = this.n;
        String str4 = this.h;
        byte[] bArr = this.e;
        long j10 = this.a;
        if (j10 != 0) {
            cVar.x(1, 0);
            cVar.z(j10);
        }
        w1[] w1VarArr = this.d;
        if (w1VarArr != null && w1VarArr.length > 0) {
            int i10 = 0;
            while (true) {
                w1[] w1VarArr2 = this.d;
                if (i10 >= w1VarArr2.length) {
                    break;
                }
                w1 w1Var = w1VarArr2[i10];
                i10++;
            }
        }
        byte[] bArr2 = l1.d;
        if (!Arrays.equals(bArr, bArr2)) {
            cVar.t(4, bArr);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            cVar.t(6, this.f);
        }
        if (str4 != null && !str4.equals("")) {
            cVar.s(8, str4);
        }
        int i11 = this.c;
        if (i11 != 0) {
            cVar.x(11, 0);
            if (i11 >= 0) {
                cVar.v(i11);
            } else {
                cVar.z(i11);
            }
        }
        if (str3 != null && !str3.equals("")) {
            cVar.s(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            cVar.s(14, str2);
        }
        long j11 = this.s;
        if (j11 != 180000) {
            cVar.x(15, 0);
            cVar.z((j11 >> 63) ^ (j11 << 1));
        }
        long j12 = this.b;
        if (j12 != 0) {
            cVar.x(17, 0);
            cVar.z(j12);
        }
        if (!Arrays.equals(this.v, bArr2)) {
            cVar.t(18, this.v);
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
                cVar.x(20, 0);
                if (i13 >= 0) {
                    cVar.v(i13);
                } else {
                    cVar.z(i13);
                }
                i12++;
            }
        }
        if (str != null && !str.equals("")) {
            cVar.s(24, str);
        }
        boolean z10 = this.y;
        if (z10) {
            cVar.x(25, 0);
            byte b10 = z10 ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = (ByteBuffer) cVar.b;
            if (!byteBuffer.hasRemaining()) {
                throw new w4(byteBuffer.position(), byteBuffer.limit());
            }
            byteBuffer.put(b10);
        }
    }

    public final Object clone() {
        try {
            v1 v1Var = (v1) d();
            w1[] w1VarArr = this.d;
            if (w1VarArr != null && w1VarArr.length > 0) {
                v1Var.d = new w1[w1VarArr.length];
                int i10 = 0;
                while (true) {
                    w1[] w1VarArr2 = this.d;
                    if (i10 >= w1VarArr2.length) {
                        break;
                    }
                    w1 w1Var = w1VarArr2[i10];
                    i10++;
                }
            }
            int[] iArr = this.x;
            if (iArr != null && iArr.length > 0) {
                v1Var.x = (int[]) iArr.clone();
            }
            return v1Var;
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
            if (obj instanceof v1) {
                v1 v1Var = (v1) obj;
                String str5 = v1Var.w;
                String str6 = v1Var.r;
                String str7 = v1Var.n;
                String str8 = v1Var.h;
                if (this.a == v1Var.a && this.b == v1Var.b && this.c == v1Var.c) {
                    w1[] w1VarArr = this.d;
                    w1[] w1VarArr2 = v1Var.d;
                    Object obj2 = n1.a;
                    int length = w1VarArr == null ? 0 : w1VarArr.length;
                    int length2 = w1VarArr2 == null ? 0 : w1VarArr2.length;
                    int i10 = 0;
                    while (i10 < length) {
                        w1 w1Var = w1VarArr[i10];
                        i10++;
                    }
                    int i11 = 0;
                    while (i11 < length2) {
                        w1 w1Var2 = w1VarArr2[i11];
                        i11++;
                    }
                    boolean z10 = i10 >= length;
                    boolean z11 = i11 >= length2;
                    if (z10 && z11) {
                        if (Arrays.equals(this.e, v1Var.e) && Arrays.equals(this.f, v1Var.f) && ((str = this.h) != null ? str.equals(str8) : str8 == null) && ((str2 = this.n) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.r) != null ? str3.equals(str6) : str6 == null) && this.s == v1Var.s && Arrays.equals(this.v, v1Var.v) && ((str4 = this.w) != null ? str4.equals(str5) : str5 == null)) {
                            int[] iArr = this.x;
                            int[] iArr2 = v1Var.x;
                            if (((iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2)) && this.y == v1Var.y) {
                            }
                        }
                    } else if (z10 == z11) {
                        w1 w1Var3 = w1VarArr[i10];
                        w1 w1Var4 = w1VarArr2[i11];
                        throw null;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (v1.class.getName().hashCode() + 527) * 31;
        long j10 = this.a;
        int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.b;
        int i11 = ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 29791) + this.c) * 29791) + 1237;
        w1[] w1VarArr = this.d;
        Object obj = n1.a;
        int i12 = 0;
        int length = w1VarArr == null ? 0 : w1VarArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            w1 w1Var = w1VarArr[i13];
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
