package i;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
