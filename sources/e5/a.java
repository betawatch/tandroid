package e5;

import d5.z;
import h3.t1;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public a(ArrayList arrayList, int i10, int i11, int i12, float f10, String str) {
        this.a = arrayList;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = f10;
        this.f = str;
    }

    public static a a(z zVar) {
        String str;
        int i10;
        int i11;
        float f10;
        byte[] bArr = d5.a.a;
        try {
            zVar.D(4);
            int r10 = (zVar.r() & 3) + 1;
            if (r10 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int r11 = zVar.r() & 31;
            for (int i12 = 0; i12 < r11; i12++) {
                int w10 = zVar.w();
                int i13 = zVar.b;
                zVar.D(w10);
                byte[] bArr2 = zVar.a;
                byte[] bArr3 = new byte[w10 + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i13, bArr3, 4, w10);
                arrayList.add(bArr3);
            }
            int r12 = zVar.r();
            for (int i14 = 0; i14 < r12; i14++) {
                int w11 = zVar.w();
                int i15 = zVar.b;
                zVar.D(w11);
                byte[] bArr4 = zVar.a;
                byte[] bArr5 = new byte[w11 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i15, bArr5, 4, w11);
                arrayList.add(bArr5);
            }
            if (r11 > 0) {
                d5.t C = d5.a.C(r10, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i16 = C.e;
                int i17 = C.f;
                float f11 = C.g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(C.a), Integer.valueOf(C.b), Integer.valueOf(C.c));
                i10 = i16;
                i11 = i17;
                f10 = f11;
            } else {
                str = null;
                i10 = -1;
                i11 = -1;
                f10 = 1.0f;
            }
            return new a(arrayList, r10, i10, i11, f10, str);
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw t1.a("Error parsing AVC config", e9);
        }
    }
}
