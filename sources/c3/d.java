package c3;

import b2.x0;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    public d(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f7, String str) {
        this.a = arrayList;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = i14;
        this.g = i15;
        this.h = i16;
        this.i = i17;
        this.j = i18;
        this.k = f7;
        this.l = str;
    }

    public static d a(e2.x xVar) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        int i16;
        int i17;
        try {
            xVar.O(4);
            int A = (xVar.A() & 3) + 1;
            if (A == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int A2 = xVar.A() & 31;
            for (int i18 = 0; i18 < A2; i18++) {
                int H = xVar.H();
                int i19 = xVar.b;
                xVar.O(H);
                byte[] bArr = xVar.a;
                byte[] bArr2 = new byte[H + 4];
                System.arraycopy(e2.g.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i19, bArr2, 4, H);
                arrayList.add(bArr2);
            }
            int A3 = xVar.A();
            for (int i20 = 0; i20 < A3; i20++) {
                int H2 = xVar.H();
                int i21 = xVar.b;
                xVar.O(H2);
                byte[] bArr3 = xVar.a;
                byte[] bArr4 = new byte[H2 + 4];
                System.arraycopy(e2.g.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i21, bArr4, 4, H2);
                arrayList.add(bArr4);
            }
            if (A2 > 0) {
                f2.p m10 = f2.q.m(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i22 = m10.e;
                int i23 = m10.f;
                int i24 = m10.h + 8;
                int i25 = m10.i + 8;
                int i26 = m10.p;
                int i27 = m10.q;
                int i28 = m10.r;
                int i29 = m10.s;
                float f10 = m10.g;
                int i30 = m10.a;
                int i31 = m10.b;
                int i32 = m10.c;
                byte[] bArr5 = e2.g.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i30), Integer.valueOf(i31), Integer.valueOf(i32));
                i15 = i29;
                f7 = f10;
                i16 = i27;
                i17 = i28;
                i13 = i25;
                i14 = i26;
                i11 = i23;
                i12 = i24;
                i10 = i22;
            } else {
                str = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f7 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new d(arrayList, A, i10, i11, i12, i13, i14, i16, i17, i15, f7, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw x0.a(e, "Error parsing AVC config");
        }
    }
}
