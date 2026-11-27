// default package

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class g2d extends f2d {
    public static final l2d r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = l2d.h(null, windowInsets);
    }

    public g2d(l2d l2dVar, WindowInsets windowInsets) {
        super(l2dVar, windowInsets);
    }

    @Override // c2d, i2d
    public mq5 f(int i) {
        return mq5.c(this.c.getInsets(j2d.a(i)));
    }

    @Override // c2d, i2d
    public mq5 g(int i) {
        return mq5.c(this.c.getInsetsIgnoringVisibility(j2d.a(i)));
    }

    @Override // c2d, i2d
    public boolean p(int i) {
        return this.c.isVisible(j2d.a(i));
    }

    @Override // c2d, i2d
    public final void d(View view) {
    }
}
