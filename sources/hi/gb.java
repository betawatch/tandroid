package hi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mh0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class gb extends View {
    public final mh0 a;
    public final org.telegram.ui.Components.m6 b;
    public final Paint c;
    public final Paint d;
    public final mc e;
    public boolean f;
    public final org.telegram.ui.Components.c6 h;

    public gb(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new mc(this);
        lr lrVar = lr.h;
        this.h = new org.telegram.ui.Components.c6(this, 0L, 240L, lrVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.66f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(3.0f), 0.0f, org.telegram.messenger.g0.L(1.66f), 805306368);
        paint2.setColor(855638016);
        mh0 mh0Var = new mh0(R.raw.group_pip_delete_icon, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.a = mh0Var;
        mh0Var.R(this);
        mh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        mh0Var.h = true;
        mh0Var.P(0);
        mh0Var.J(true);
        mh0Var.start();
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(true, true, false);
        this.b = m6Var;
        m6Var.n(0.3f, 250L, lrVar);
        m6Var.N = org.telegram.messenger.g0.q.x;
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.u(-1);
        m6Var.s(org.telegram.messenger.g0.N(1.33f), org.telegram.messenger.g0.L(1.0f), TLObject.FLAG_30);
        m6Var.t(gd.M0(2131743708, null), true, true);
        m6Var.b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        this.e.c(z10);
        this.b.t(gd.M0((z10 || z11) ? 2131743707 : 2131743708, null), true, true);
        boolean z12 = z10 && !z11;
        this.f = z12;
        mh0 mh0Var = this.a;
        if (z12) {
            if (mh0Var.b0 > 34) {
                mh0Var.N(0, false, false);
            }
            mh0Var.P(33);
            mh0Var.start();
        } else {
            mh0Var.P(z11 ? 66 : 0);
            mh0Var.start();
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.g0.L(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float d = (this.h.d(this.f) * org.telegram.messenger.g0.L(3.0f)) + L;
        canvas.drawCircle(width, height, d, this.d);
        canvas.drawCircle(width, height, d, this.c);
        float L2 = org.telegram.messenger.g0.L(48.0f) / 2.0f;
        mh0 mh0Var = this.a;
        mh0Var.setBounds((int) (width - L2), (int) (height - L2), (int) (width + L2), (int) (L2 + height));
        mh0Var.draw(canvas);
        int L3 = (int) (height + L + org.telegram.messenger.g0.L(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.m6 m6Var = this.b;
        m6Var.setBounds(0, L3, width2, height2);
        m6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(i7, org.telegram.messenger.g0.L(120.0f));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b || super.verifyDrawable(drawable);
    }
}
