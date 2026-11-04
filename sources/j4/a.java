package j4;

import android.graphics.Rect;
import c4.f;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a {
    public boolean d;
    public boolean e;
    public int[] f;
    public int g;
    public int h;
    public Rect i;
    public long b = -9223372036854775807L;
    public long c = -9223372036854775807L;
    public final int[] a = new int[4];
    public int j = -1;
    public int k = -1;

    public static int a(int[] iArr, int i3) {
        return (i3 < 0 || i3 >= iArr.length) ? iArr[0] : iArr[i3];
    }

    public static int c(int i3, int i10) {
        return (i3 & 16777215) | ((i10 * 17) << 24);
    }

    public final void b(f fVar, boolean z10, Rect rect, int[] iArr) {
        int i3;
        int i10;
        int width = rect.width();
        int height = rect.height();
        int i11 = !z10 ? 1 : 0;
        int i12 = i11 * width;
        while (true) {
            int i13 = 0;
            do {
                int i14 = 0;
                for (int i15 = 1; i14 < i15 && i15 <= 64; i15 <<= 2) {
                    if (fVar.b() < 4) {
                        i3 = -1;
                        i10 = 0;
                        break;
                    }
                    i14 = (i14 << 4) | fVar.j(4);
                }
                i3 = i14 & 3;
                i10 = i14 < 4 ? width : i14 >> 2;
                int min = Math.min(i10, width - i13);
                if (min > 0) {
                    int i16 = i12 + min;
                    Arrays.fill(iArr, i12, i16, this.a[i3]);
                    i13 += min;
                    i12 = i16;
                }
            } while (i13 < width);
            i11 += 2;
            if (i11 >= height) {
                return;
            }
            i12 = i11 * width;
            fVar.c();
        }
    }
}
