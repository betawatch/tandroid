package e5;

import h3.t1;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public a(ArrayList arrayList, int i9, int i10, int i11, float f10, String str) {
        this.a = arrayList;
        this.b = i9;
        this.c = i10;
        this.d = i11;
        this.e = f10;
        this.f = str;
    }

    public static a a(d5.y yVar) {
        String str;
        int i9;
        int i10;
        float f10;
        byte[] bArr = d5.a.a;
        try {
            yVar.D(4);
            int r10 = (yVar.r() & 3) + 1;
            if (r10 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int r11 = yVar.r() & 31;
            for (int i11 = 0; i11 < r11; i11++) {
                int w8 = yVar.w();
                int i12 = yVar.b;
                yVar.D(w8);
                byte[] bArr2 = yVar.a;
                byte[] bArr3 = new byte[w8 + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i12, bArr3, 4, w8);
                arrayList.add(bArr3);
            }
            int r12 = yVar.r();
            for (int i13 = 0; i13 < r12; i13++) {
                int w10 = yVar.w();
                int i14 = yVar.b;
                yVar.D(w10);
                byte[] bArr4 = yVar.a;
                byte[] bArr5 = new byte[w10 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i14, bArr5, 4, w10);
                arrayList.add(bArr5);
            }
            if (r11 > 0) {
                d5.t C = d5.a.C(r10, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i15 = C.e;
                int i16 = C.f;
                float f11 = C.g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(C.a), Integer.valueOf(C.b), Integer.valueOf(C.c));
                i9 = i15;
                i10 = i16;
                f10 = f11;
            } else {
                str = null;
                i9 = -1;
                i10 = -1;
                f10 = 1.0f;
            }
            return new a(arrayList, r10, i9, i10, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw t1.a("Error parsing AVC config", e10);
        }
    }
}
