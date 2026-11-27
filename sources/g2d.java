// default package

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
