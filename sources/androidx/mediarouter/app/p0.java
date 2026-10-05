package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class p0 {
    public final BitmapDrawable a;
    public final Rect c;
    public Interpolator d;
    public long e;
    public final Rect f;
    public int g;
    public long i;
    public boolean j;
    public boolean k;
    public of.b l;
    public float b = 1.0f;
    public float h = 1.0f;

    public p0(BitmapDrawable bitmapDrawable, Rect rect) {
        this.a = bitmapDrawable;
        this.f = rect;
        Rect rect2 = new Rect(rect);
        this.c = rect2;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.b * 255.0f));
            bitmapDrawable.setBounds(rect2);
        }
    }
}
