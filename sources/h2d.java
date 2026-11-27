// default package

import android.view.WindowInsets;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
