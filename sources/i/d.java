package i;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements TimeInterpolator {
    public int[] a;
    public int b;
    public int c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        int i3 = (int) ((f10 * this.c) + 0.5f);
        int i10 = this.b;
        int[] iArr = this.a;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11];
            if (i3 < i12) {
                break;
            }
            i3 -= i12;
            i11++;
        }
        return (i11 / i10) + (i11 < i10 ? i3 / this.c : 0.0f);
    }
}
