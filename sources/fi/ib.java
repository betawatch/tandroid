package fi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ib extends View {
    public final zg0 a;
    public final org.telegram.ui.Components.i6 b;
    public final Paint c;
    public final Paint d;
    public final ic e;
    public boolean f;
    public final org.telegram.ui.Components.w5 h;

    public ib(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new ic(this);
        xq xqVar = xq.h;
        this.h = new org.telegram.ui.Components.w5(this, 0L, 240L, xqVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.66f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(3.0f), 0.0f, org.telegram.messenger.g0.L(1.66f), 805306368);
        paint2.setColor(855638016);
        zg0 zg0Var = new zg0(R.raw.group_pip_delete_icon, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), true, null);
        this.a = zg0Var;
        zg0Var.R(this);
        zg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        zg0Var.h = true;
        zg0Var.P(0);
        zg0Var.J(true);
        zg0Var.start();
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, false);
        this.b = i6Var;
        i6Var.n(0.3f, 250L, xqVar);
        i6Var.M = org.telegram.messenger.g0.q.x;
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.u(-1);
        i6Var.s(org.telegram.messenger.g0.N(1.33f), org.telegram.messenger.g0.L(1.0f), TLObject.FLAG_30);
        i6Var.t(hd.M0(2131743946, null), true, true);
        i6Var.b = 17;
    }

    public final void a(boolean z9, boolean z10) {
        this.e.c(z9);
        this.b.t(hd.M0((z9 || z10) ? 2131743945 : 2131743946, null), true, true);
        boolean z11 = z9 && !z10;
        this.f = z11;
        zg0 zg0Var = this.a;
        if (z11) {
            if (zg0Var.a0 > 34) {
                zg0Var.N(0, false, false);
            }
            zg0Var.P(33);
            zg0Var.start();
        } else {
            zg0Var.P(z10 ? 66 : 0);
            zg0Var.start();
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
        zg0 zg0Var = this.a;
        zg0Var.setBounds((int) (width - L2), (int) (height - L2), (int) (width + L2), (int) (L2 + height));
        zg0Var.draw(canvas);
        int L3 = (int) (height + L + org.telegram.messenger.g0.L(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.i6 i6Var = this.b;
        i6Var.setBounds(0, L3, width2, height2);
        i6Var.draw(canvas);
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
