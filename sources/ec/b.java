package ec;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b {
    public final zb.b a;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final ArrayList b = new ArrayList(5);
    public final int[] h = new int[3];

    public b(zb.b bVar, int i3, int i10, int i11, int i12, float f10) {
        this.a = bVar;
        this.c = i3;
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.g = f10;
    }

    public final boolean a(int[] iArr) {
        float f10 = this.g;
        float f11 = f10 / 2.0f;
        for (int i3 = 0; i3 < 3; i3++) {
            if (Math.abs(f10 - iArr[i3]) >= f11) {
                return false;
            }
        }
        return true;
    }

    public final a b(int i3, int i10, int[] iArr) {
        int i11 = 0;
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = i12 + i13 + iArr[2];
        float f10 = (i10 - r5) - (i13 / 2.0f);
        int i15 = (int) f10;
        int i16 = i13 * 2;
        zb.b bVar = this.a;
        int i17 = bVar.b;
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i18 = i3;
        while (i18 >= 0 && bVar.b(i15, i18)) {
            int i19 = iArr2[1];
            if (i19 > i16) {
                break;
            }
            iArr2[1] = i19 + 1;
            i18--;
        }
        float f11 = Float.NaN;
        if (i18 >= 0 && iArr2[1] <= i16) {
            while (i18 >= 0 && !bVar.b(i15, i18)) {
                int i20 = iArr2[0];
                if (i20 > i16) {
                    break;
                }
                iArr2[0] = i20 + 1;
                i18--;
            }
            if (iArr2[0] <= i16) {
                int i21 = i3 + 1;
                while (i21 < i17 && bVar.b(i15, i21)) {
                    int i22 = iArr2[1];
                    if (i22 > i16) {
                        break;
                    }
                    iArr2[1] = i22 + 1;
                    i21++;
                }
                if (i21 != i17 && iArr2[1] <= i16) {
                    while (i21 < i17 && !bVar.b(i15, i21)) {
                        int i23 = iArr2[2];
                        if (i23 > i16) {
                            break;
                        }
                        iArr2[2] = i23 + 1;
                        i21++;
                    }
                    int i24 = iArr2[2];
                    if (i24 <= i16 && Math.abs(((iArr2[0] + iArr2[1]) + i24) - i14) * 5 < i14 * 2 && a(iArr2)) {
                        f11 = (i21 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f11)) {
            return null;
        }
        float f12 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            a aVar = (a) obj;
            float f13 = aVar.c;
            float f14 = aVar.a;
            float f15 = aVar.b;
            if (Math.abs(f11 - f15) <= f12 && Math.abs(f10 - f14) <= f12) {
                float abs = Math.abs(f12 - f13);
                if (abs <= 1.0f || abs <= f13) {
                    return new a((f14 + f10) / 2.0f, (f15 + f11) / 2.0f, (aVar.c + f12) / 2.0f);
                }
            }
        }
        arrayList.add(new a(f10, f11, f12));
        return null;
    }
}
