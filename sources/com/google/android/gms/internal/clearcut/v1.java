package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v1 extends m1 implements Cloneable {
    public boolean E;
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
    public byte[] w;
    public String x;
    public int[] y;

    @Override // com.google.android.gms.internal.clearcut.m1
    public final void a(bb.c cVar) {
        String str = this.x;
        String str2 = this.r;
        String str3 = this.n;
        String str4 = this.h;
        byte[] bArr = this.e;
        long j10 = this.a;
        if (j10 != 0) {
            cVar.q(1, 0);
            cVar.s(j10);
        }
        w1[] w1VarArr = this.d;
        if (w1VarArr != null && w1VarArr.length > 0) {
            int i3 = 0;
            while (true) {
                w1[] w1VarArr2 = this.d;
                if (i3 >= w1VarArr2.length) {
                    break;
                }
                w1 w1Var = w1VarArr2[i3];
                i3++;
            }
        }
        byte[] bArr2 = l1.d;
        if (!Arrays.equals(bArr, bArr2)) {
            cVar.k(4, bArr);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            cVar.k(6, this.f);
        }
        if (str4 != null && !str4.equals("")) {
            cVar.j(8, str4);
        }
        int i10 = this.c;
        if (i10 != 0) {
            cVar.q(11, 0);
            if (i10 >= 0) {
                cVar.m(i10);
            } else {
                cVar.s(i10);
            }
        }
        if (str3 != null && !str3.equals("")) {
            cVar.j(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            cVar.j(14, str2);
        }
        long j11 = this.s;
        if (j11 != 180000) {
            cVar.q(15, 0);
            cVar.s((j11 >> 63) ^ (j11 << 1));
        }
        long j12 = this.b;
        if (j12 != 0) {
            cVar.q(17, 0);
            cVar.s(j12);
        }
        if (!Arrays.equals(this.w, bArr2)) {
            cVar.k(18, this.w);
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
                cVar.q(20, 0);
                if (i12 >= 0) {
                    cVar.m(i12);
                } else {
                    cVar.s(i12);
                }
                i11++;
            }
        }
        if (str != null && !str.equals("")) {
            cVar.j(24, str);
        }
        boolean z10 = this.E;
        if (z10) {
            cVar.q(25, 0);
            byte b10 = z10 ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = (ByteBuffer) cVar.b;
            if (!byteBuffer.hasRemaining()) {
                throw new androidx.datastore.preferences.protobuf.l(byteBuffer.position(), byteBuffer.limit());
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
                int i3 = 0;
                while (true) {
                    w1[] w1VarArr2 = this.d;
                    if (i3 >= w1VarArr2.length) {
                        break;
                    }
                    w1 w1Var = w1VarArr2[i3];
                    i3++;
                }
            }
            int[] iArr = this.y;
            if (iArr != null && iArr.length > 0) {
                v1Var.y = (int[]) iArr.clone();
            }
            return v1Var;
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
            if (obj instanceof v1) {
                v1 v1Var = (v1) obj;
                String str5 = v1Var.x;
                String str6 = v1Var.r;
                String str7 = v1Var.n;
                String str8 = v1Var.h;
                if (this.a == v1Var.a && this.b == v1Var.b && this.c == v1Var.c) {
                    w1[] w1VarArr = this.d;
                    w1[] w1VarArr2 = v1Var.d;
                    Object obj2 = n1.a;
                    int length = w1VarArr == null ? 0 : w1VarArr.length;
                    int length2 = w1VarArr2 == null ? 0 : w1VarArr2.length;
                    int i3 = 0;
                    while (i3 < length) {
                        w1 w1Var = w1VarArr[i3];
                        i3++;
                    }
                    int i10 = 0;
                    while (i10 < length2) {
                        w1 w1Var2 = w1VarArr2[i10];
                        i10++;
                    }
                    boolean z10 = i3 >= length;
                    boolean z11 = i10 >= length2;
                    if (z10 && z11) {
                        if (Arrays.equals(this.e, v1Var.e) && Arrays.equals(this.f, v1Var.f) && ((str = this.h) != null ? str.equals(str8) : str8 == null) && ((str2 = this.n) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.r) != null ? str3.equals(str6) : str6 == null) && this.s == v1Var.s && Arrays.equals(this.w, v1Var.w) && ((str4 = this.x) != null ? str4.equals(str5) : str5 == null)) {
                            int[] iArr = this.y;
                            int[] iArr2 = v1Var.y;
                            if (((iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2)) && this.E == v1Var.E) {
                            }
                        }
                    } else if (z10 == z11) {
                        w1 w1Var3 = w1VarArr[i3];
                        w1 w1Var4 = w1VarArr2[i10];
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
        int i3 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.b;
        int i10 = ((((i3 + ((int) (j11 ^ (j11 >>> 32)))) * 29791) + this.c) * 29791) + 1237;
        w1[] w1VarArr = this.d;
        Object obj = n1.a;
        int i11 = 0;
        int length = w1VarArr == null ? 0 : w1VarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            w1 w1Var = w1VarArr[i12];
        }
        int hashCode2 = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + (i10 * 961)) * 961)) * 31;
        String str = this.h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.r;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        long j12 = this.s;
        int hashCode6 = (Arrays.hashCode(this.w) + ((((hashCode4 + hashCode5) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 961)) * 31;
        String str4 = this.x;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 961;
        int[] iArr = this.y;
        if (iArr != null && iArr.length != 0) {
            i11 = Arrays.hashCode(iArr);
        }
        return (((hashCode7 + i11) * 29791) + (this.E ? 1231 : 1237)) * 31;
    }
}
