// default package

import android.view.WindowInsets;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class h2d extends g2d {
    public static final l2d s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = l2d.h(null, windowInsets);
    }

    public h2d(l2d l2dVar, WindowInsets windowInsets) {
        super(l2dVar, windowInsets);
    }

    @Override // g2d, c2d, i2d
    public mq5 f(int i) {
        return mq5.c(this.c.getInsets(k2d.a(i)));
    }

    @Override // g2d, c2d, i2d
    public mq5 g(int i) {
        return mq5.c(this.c.getInsetsIgnoringVisibility(k2d.a(i)));
    }

    @Override // g2d, c2d, i2d
    public boolean p(int i) {
        return this.c.isVisible(k2d.a(i));
    }
}
