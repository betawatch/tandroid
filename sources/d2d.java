// default package

import android.view.WindowInsets;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class d2d extends c2d {
    public mq5 n;

    public d2d(l2d l2dVar, WindowInsets windowInsets) {
        super(l2dVar, windowInsets);
        this.n = null;
    }

    @Override // i2d
    public l2d b() {
        return l2d.h(null, this.c.consumeStableInsets());
    }

    @Override // i2d
    public l2d c() {
        return l2d.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // i2d
    public final mq5 i() {
        mq5 mq5Var = this.n;
        if (mq5Var != null) {
            return mq5Var;
        }
        WindowInsets windowInsets = this.c;
        mq5 b = mq5.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.n = b;
        return b;
    }

    @Override // i2d
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override // i2d
    public void s(mq5 mq5Var) {
        this.n = mq5Var;
    }
}
