package gi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ib extends View {
    public final ch0 a;
    public final org.telegram.ui.Components.g6 b;
    public final Paint c;
    public final Paint d;
    public final gc e;
    public boolean f;
    public final org.telegram.ui.Components.u5 h;

    public ib(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new gc(this);
        xq xqVar = xq.h;
        this.h = new org.telegram.ui.Components.u5(this, 0L, 240L, xqVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.66f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(3.0f), 0.0f, org.telegram.messenger.g0.L(1.66f), 805306368);
        paint2.setColor(855638016);
        ch0 ch0Var = new ch0(R.raw.group_pip_delete_icon, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.a = ch0Var;
        ch0Var.R(this);
        ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        ch0Var.h = true;
        ch0Var.P(0);
        ch0Var.J(true);
        ch0Var.start();
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(true, true, false);
        this.b = g6Var;
        g6Var.n(0.3f, 250L, xqVar);
        g6Var.M = org.telegram.messenger.g0.q.x;
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.u(-1);
        g6Var.s(org.telegram.messenger.g0.N(1.33f), org.telegram.messenger.g0.L(1.0f), TLObject.FLAG_30);
        g6Var.t(bd.M0(2131743955, null), true, true);
        g6Var.b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        this.e.c(z10);
        this.b.t(bd.M0((z10 || z11) ? 2131743954 : 2131743955, null), true, true);
        boolean z12 = z10 && !z11;
        this.f = z12;
        ch0 ch0Var = this.a;
        if (z12) {
            if (ch0Var.b0 > 34) {
                ch0Var.N(0, false, false);
            }
            ch0Var.P(33);
            ch0Var.start();
        } else {
            ch0Var.P(z11 ? 66 : 0);
            ch0Var.start();
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
        ch0 ch0Var = this.a;
        ch0Var.setBounds((int) (width - L2), (int) (height - L2), (int) (width + L2), (int) (L2 + height));
        ch0Var.draw(canvas);
        int L3 = (int) (height + L + org.telegram.messenger.g0.L(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.g6 g6Var = this.b;
        g6Var.setBounds(0, L3, width2, height2);
        g6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(i3, org.telegram.messenger.g0.L(120.0f));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b || super.verifyDrawable(drawable);
    }
}
