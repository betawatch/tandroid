package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.cast.b5;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x1 extends o1 implements Cloneable {
    public long a;
    public long b;
    public int c;
    public y1[] d;
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

    @Override // com.google.android.gms.internal.clearcut.o1
    public final void a(a6.i iVar) {
        String str = this.w;
        String str2 = this.r;
        String str3 = this.n;
        String str4 = this.h;
        byte[] bArr = this.e;
        long j3 = this.a;
        if (j3 != 0) {
            iVar.a0(1, 0);
            iVar.d0(j3);
        }
        y1[] y1VarArr = this.d;
        if (y1VarArr != null && y1VarArr.length > 0) {
            int i10 = 0;
            while (true) {
                y1[] y1VarArr2 = this.d;
                if (i10 >= y1VarArr2.length) {
                    break;
                }
                y1 y1Var = y1VarArr2[i10];
                i10++;
            }
        }
        byte[] bArr2 = n1.d;
        if (!Arrays.equals(bArr, bArr2)) {
            iVar.W(4, bArr);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            iVar.W(6, this.f);
        }
        if (str4 != null && !str4.equals("")) {
            iVar.V(8, str4);
        }
        int i11 = this.c;
        if (i11 != 0) {
            iVar.a0(11, 0);
            if (i11 >= 0) {
                iVar.Y(i11);
            } else {
                iVar.d0(i11);
            }
        }
        if (str3 != null && !str3.equals("")) {
            iVar.V(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            iVar.V(14, str2);
        }
        long j10 = this.s;
        if (j10 != 180000) {
            iVar.a0(15, 0);
            iVar.d0((j10 >> 63) ^ (j10 << 1));
        }
        long j11 = this.b;
        if (j11 != 0) {
            iVar.a0(17, 0);
            iVar.d0(j11);
        }
        if (!Arrays.equals(this.v, bArr2)) {
            iVar.W(18, this.v);
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
                iVar.a0(20, 0);
                if (i13 >= 0) {
                    iVar.Y(i13);
                } else {
                    iVar.d0(i13);
                }
                i12++;
            }
        }
        if (str != null && !str.equals("")) {
            iVar.V(24, str);
        }
        boolean z10 = this.y;
        if (z10) {
            iVar.a0(25, 0);
            byte b10 = z10 ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = (ByteBuffer) iVar.b;
            if (!byteBuffer.hasRemaining()) {
                throw new b5(byteBuffer.position(), byteBuffer.limit());
            }
            byteBuffer.put(b10);
        }
    }

    public final Object clone() {
        try {
            x1 x1Var = (x1) d();
            y1[] y1VarArr = this.d;
            if (y1VarArr != null && y1VarArr.length > 0) {
                x1Var.d = new y1[y1VarArr.length];
                int i10 = 0;
                while (true) {
                    y1[] y1VarArr2 = this.d;
                    if (i10 >= y1VarArr2.length) {
                        break;
                    }
                    y1 y1Var = y1VarArr2[i10];
                    i10++;
                }
            }
            int[] iArr = this.x;
            if (iArr != null && iArr.length > 0) {
                x1Var.x = (int[]) iArr.clone();
            }
            return x1Var;
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
            if (obj instanceof x1) {
                x1 x1Var = (x1) obj;
                String str5 = x1Var.w;
                String str6 = x1Var.r;
                String str7 = x1Var.n;
                String str8 = x1Var.h;
                if (this.a == x1Var.a && this.b == x1Var.b && this.c == x1Var.c) {
                    y1[] y1VarArr = this.d;
                    y1[] y1VarArr2 = x1Var.d;
                    Object obj2 = p1.a;
                    int length = y1VarArr == null ? 0 : y1VarArr.length;
                    int length2 = y1VarArr2 == null ? 0 : y1VarArr2.length;
                    int i10 = 0;
                    while (i10 < length) {
                        y1 y1Var = y1VarArr[i10];
                        i10++;
                    }
                    int i11 = 0;
                    while (i11 < length2) {
                        y1 y1Var2 = y1VarArr2[i11];
                        i11++;
                    }
                    boolean z10 = i10 >= length;
                    boolean z11 = i11 >= length2;
                    if (z10 && z11) {
                        if (Arrays.equals(this.e, x1Var.e) && Arrays.equals(this.f, x1Var.f) && ((str = this.h) != null ? str.equals(str8) : str8 == null) && ((str2 = this.n) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.r) != null ? str3.equals(str6) : str6 == null) && this.s == x1Var.s && Arrays.equals(this.v, x1Var.v) && ((str4 = this.w) != null ? str4.equals(str5) : str5 == null)) {
                            int[] iArr = this.x;
                            int[] iArr2 = x1Var.x;
                            if (((iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2)) && this.y == x1Var.y) {
                            }
                        }
                    } else if (z10 == z11) {
                        y1 y1Var3 = y1VarArr[i10];
                        y1 y1Var4 = y1VarArr2[i11];
                        throw null;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (x1.class.getName().hashCode() + 527) * 31;
        long j3 = this.a;
        int i10 = (hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j10 = this.b;
        int i11 = ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 29791) + this.c) * 29791) + 1237;
        y1[] y1VarArr = this.d;
        Object obj = p1.a;
        int i12 = 0;
        int length = y1VarArr == null ? 0 : y1VarArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            y1 y1Var = y1VarArr[i13];
        }
        int hashCode2 = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + (i11 * 961)) * 961)) * 31;
        String str = this.h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.r;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        long j11 = this.s;
        int hashCode6 = (Arrays.hashCode(this.v) + ((((hashCode4 + hashCode5) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 961)) * 31;
        String str4 = this.w;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 961;
        int[] iArr = this.x;
        if (iArr != null && iArr.length != 0) {
            i12 = Arrays.hashCode(iArr);
        }
        return (((hashCode7 + i12) * 29791) + (this.y ? 1231 : 1237)) * 31;
    }
}
