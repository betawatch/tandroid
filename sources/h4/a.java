package h4;

import a4.h;
import android.graphics.Rect;
import java.util.Arrays;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a {
    public boolean b;
    public boolean c;
    public int[] d;
    public int e;
    public int f;
    public Rect g;
    public final int[] a = new int[4];
    public int h = -1;
    public int i = -1;

    public static int a(int i10, int[] iArr) {
        return (i10 < 0 || i10 >= iArr.length) ? iArr[0] : iArr[i10];
    }

    public static int c(int i10, int i11) {
        return (i10 & 16777215) | ((i11 * 17) << 24);
    }

    public final void b(h hVar, boolean z10, Rect rect, int[] iArr) {
        int i10;
        int i11;
        int width = rect.width();
        int height = rect.height();
        int i12 = !z10 ? 1 : 0;
        int i13 = i12 * width;
        while (true) {
            int i14 = 0;
            do {
                int i15 = 0;
                for (int i16 = 1; i15 < i16 && i16 <= 64; i16 <<= 2) {
                    if (hVar.b() < 4) {
                        i11 = 0;
                        i10 = -1;
                        break;
                    }
                    i15 = (i15 << 4) | hVar.i(4);
                }
                i10 = i15 & 3;
                i11 = i15 < 4 ? width : i15 >> 2;
                int min = Math.min(i11, width - i14);
                if (min > 0) {
                    int i17 = i13 + min;
                    Arrays.fill(iArr, i13, i17, this.a[i10]);
                    i14 += min;
                    i13 = i17;
                }
            } while (i14 < width);
            i12 += 2;
            if (i12 >= height) {
                return;
            }
            i13 = i12 * width;
            hVar.c();
        }
    }
}
