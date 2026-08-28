package i;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements TimeInterpolator {
    public int[] a;
    public int b;
    public int c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        int i9 = (int) ((f10 * this.c) + 0.5f);
        int i10 = this.b;
        int[] iArr = this.a;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11];
            if (i9 < i12) {
                break;
            }
            i9 -= i12;
            i11++;
        }
        return (i11 / i10) + (i11 < i10 ? i9 / this.c : 0.0f);
    }
}
