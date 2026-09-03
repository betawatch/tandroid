package i5;

import j3.r1;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final String i;

    public a(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, float f10, String str) {
        this.a = arrayList;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = i14;
        this.g = i15;
        this.h = f10;
        this.i = str;
    }

    public static a a(h5.w wVar) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        byte[] bArr = h5.a.a;
        try {
            wVar.G(4);
            int u10 = (wVar.u() & 3) + 1;
            if (u10 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int u11 = wVar.u() & 31;
            for (int i15 = 0; i15 < u11; i15++) {
                int z4 = wVar.z();
                int i16 = wVar.b;
                wVar.G(z4);
                byte[] bArr2 = wVar.a;
                byte[] bArr3 = new byte[z4 + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i16, bArr3, 4, z4);
                arrayList.add(bArr3);
            }
            int u12 = wVar.u();
            for (int i17 = 0; i17 < u12; i17++) {
                int z10 = wVar.z();
                int i18 = wVar.b;
                wVar.G(z10);
                byte[] bArr4 = wVar.a;
                byte[] bArr5 = new byte[z10 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i18, bArr5, 4, z10);
                arrayList.add(bArr5);
            }
            if (u11 > 0) {
                h5.r C = h5.a.C(u10, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i19 = C.e;
                int i20 = C.f;
                int i21 = C.n;
                int i22 = C.o;
                int i23 = C.p;
                float f11 = C.g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(C.a), Integer.valueOf(C.b), Integer.valueOf(C.c));
                i13 = i22;
                i14 = i23;
                f10 = f11;
                i10 = i19;
                i11 = i20;
                i12 = i21;
            } else {
                str = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                f10 = 1.0f;
            }
            return new a(arrayList, u10, i10, i11, i12, i13, i14, f10, str);
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw r1.a("Error parsing AVC config", e6);
        }
    }
}
