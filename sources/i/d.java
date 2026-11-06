package i;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d implements TimeInterpolator {
    public int[] a;
    public int b;
    public int c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        int i7 = (int) ((f10 * this.c) + 0.5f);
        int i10 = this.b;
        int[] iArr = this.a;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11];
            if (i7 < i12) {
                break;
            }
            i7 -= i12;
            i11++;
        }
        return (i11 / i10) + (i11 < i10 ? i7 / this.c : 0.0f);
    }
}
