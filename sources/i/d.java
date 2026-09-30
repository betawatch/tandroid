package i;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class d implements TimeInterpolator {
    public int[] a;
    public int b;
    public int c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        int i10 = (int) ((f7 * this.c) + 0.5f);
        int i11 = this.b;
        int[] iArr = this.a;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr[i12];
            if (i10 < i13) {
                break;
            }
            i10 -= i13;
            i12++;
        }
        return (i12 / i11) + (i12 < i11 ? i10 / this.c : 0.0f);
    }
}
