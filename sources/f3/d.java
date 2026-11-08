package f3;

import e2.t0;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class d {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public d(ArrayList arrayList, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.a = arrayList;
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = i13;
        this.g = i14;
        this.h = i15;
        this.i = i16;
        this.j = i17;
        this.k = f10;
        this.l = str;
    }

    public static d a(h2.x xVar) {
        String str;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        try {
            xVar.O(4);
            int A = (xVar.A() & 3) + 1;
            if (A == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int A2 = xVar.A() & 31;
            for (int i17 = 0; i17 < A2; i17++) {
                int H = xVar.H();
                int i18 = xVar.b;
                xVar.O(H);
                byte[] bArr = xVar.a;
                byte[] bArr2 = new byte[H + 4];
                System.arraycopy(h2.g.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i18, bArr2, 4, H);
                arrayList.add(bArr2);
            }
            int A3 = xVar.A();
            for (int i19 = 0; i19 < A3; i19++) {
                int H2 = xVar.H();
                int i20 = xVar.b;
                xVar.O(H2);
                byte[] bArr3 = xVar.a;
                byte[] bArr4 = new byte[H2 + 4];
                System.arraycopy(h2.g.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i20, bArr4, 4, H2);
                arrayList.add(bArr4);
            }
            if (A2 > 0) {
                i2.n m10 = i2.o.m(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i21 = m10.e;
                int i22 = m10.f;
                int i23 = m10.h + 8;
                int i24 = m10.i + 8;
                int i25 = m10.p;
                int i26 = m10.q;
                int i27 = m10.r;
                int i28 = m10.s;
                float f11 = m10.g;
                int i29 = m10.a;
                int i30 = m10.b;
                int i31 = m10.c;
                byte[] bArr5 = h2.g.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i29), Integer.valueOf(i30), Integer.valueOf(i31));
                i14 = i28;
                f10 = f11;
                i15 = i26;
                i16 = i27;
                i12 = i24;
                i13 = i25;
                i10 = i22;
                i11 = i23;
                i7 = i21;
            } else {
                str = null;
                i7 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = 16;
                f10 = 1.0f;
                i15 = -1;
                i16 = -1;
            }
            return new d(arrayList, A, i7, i10, i11, i12, i13, i15, i16, i14, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw t0.a(e10, "Error parsing AVC config");
        }
    }
}
