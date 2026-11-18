package i;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
