// default package

import android.view.WindowInsets;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class f2d extends e2d {
    public mq5 o;
    public mq5 p;
    public mq5 q;

    public f2d(l2d l2dVar, WindowInsets windowInsets) {
        super(l2dVar, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // i2d
    public mq5 h() {
        mq5 mq5Var = this.p;
        if (mq5Var != null) {
            return mq5Var;
        }
        mq5 c = mq5.c(this.c.getMandatorySystemGestureInsets());
        this.p = c;
        return c;
    }

    @Override // i2d
    public mq5 j() {
        mq5 mq5Var = this.o;
        if (mq5Var != null) {
            return mq5Var;
        }
        mq5 c = mq5.c(this.c.getSystemGestureInsets());
        this.o = c;
        return c;
    }

    @Override // i2d
    public mq5 l() {
        mq5 mq5Var = this.q;
        if (mq5Var != null) {
            return mq5Var;
        }
        mq5 c = mq5.c(this.c.getTappableElementInsets());
        this.q = c;
        return c;
    }

    @Override // c2d, i2d
    public l2d m(int i, int i2, int i3, int i4) {
        return l2d.h(null, this.c.inset(i, i2, i3, i4));
    }

    @Override // d2d, i2d
    public void s(mq5 mq5Var) {
    }
}
