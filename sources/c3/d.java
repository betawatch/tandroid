package c3;

import b2.s0;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    public static d a(e2.v vVar) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f7;
        try {
            vVar.K(4);
            int x10 = (vVar.x() & 3) + 1;
            if (x10 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int x11 = vVar.x() & 31;
            for (int i18 = 0; i18 < x11; i18++) {
                int D = vVar.D();
                int i19 = vVar.b;
                vVar.K(D);
                byte[] bArr = vVar.a;
                byte[] bArr2 = new byte[D + 4];
                System.arraycopy(e2.e.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i19, bArr2, 4, D);
                arrayList.add(bArr2);
            }
            int x12 = vVar.x();
            for (int i20 = 0; i20 < x12; i20++) {
                int D2 = vVar.D();
                int i21 = vVar.b;
                vVar.K(D2);
                byte[] bArr3 = vVar.a;
                byte[] bArr4 = new byte[D2 + 4];
                System.arraycopy(e2.e.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i21, bArr4, 4, D2);
                arrayList.add(bArr4);
            }
            if (x11 > 0) {
                f2.o j3 = f2.p.j(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i22 = j3.e;
                int i23 = j3.f;
                int i24 = j3.h + 8;
                int i25 = j3.i + 8;
                int i26 = j3.p;
                int i27 = j3.q;
                int i28 = j3.r;
                int i29 = j3.s;
                float f10 = j3.g;
                int i30 = j3.a;
                int i31 = j3.b;
                int i32 = j3.c;
                byte[] bArr5 = e2.e.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i30), Integer.valueOf(i31), Integer.valueOf(i32));
                i17 = i29;
                f7 = f10;
                i15 = i27;
                i16 = i28;
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
                i15 = -1;
                i16 = -1;
                i17 = 16;
                f7 = 1.0f;
            }
            return new d(arrayList, x10, i10, i11, i12, i13, i14, i15, i16, i17, f7, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw s0.a(e7, "Error parsing AVC config");
        }
    }
}
