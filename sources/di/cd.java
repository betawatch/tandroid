package di;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class cd extends View {
    public final xi0 a;
    public final org.telegram.ui.Components.p6 b;
    public final Paint c;
    public final Paint d;
    public final org.telegram.ui.Components.zc e;
    public boolean f;
    public final org.telegram.ui.Components.e6 h;

    public cd(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new org.telegram.ui.Components.zc(this);
        pr prVar = pr.h;
        this.h = new org.telegram.ui.Components.e6(this, 0L, 240L, prVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        xi0 xi0Var = new xi0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.a = xi0Var;
        xi0Var.v0 = this;
        xi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        xi0Var.h = true;
        xi0Var.N(0);
        xi0Var.H(true);
        xi0Var.start();
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, true, false, false);
        this.b = p6Var;
        p6Var.k(0.3f, 250L, prVar);
        p6Var.G = AndroidUtilities.displaySize.x;
        p6Var.t(AndroidUtilities.dp(14.0f));
        p6Var.r(-1);
        p6Var.p(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), TLObject.FLAG_30);
        p6Var.q(LocaleController.getString(R.string.TrashHintDrag), true, true);
        p6Var.b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        this.e.c(z10);
        this.b.q(LocaleController.getString((z10 || z11) ? R.string.TrashHintRelease : R.string.TrashHintDrag), true, true);
        boolean z12 = z10 && !z11;
        this.f = z12;
        xi0 xi0Var = this.a;
        if (z12) {
            if (xi0Var.b0 > 34) {
                xi0Var.L(0, false, false);
            }
            xi0Var.N(33);
            xi0Var.start();
        } else {
            xi0Var.N(z11 ? 66 : 0);
            xi0Var.start();
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e7 = (this.h.e(this.f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e7, this.d);
        canvas.drawCircle(width, height, e7, this.c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        xi0 xi0Var = this.a;
        xi0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        xi0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.p6 p6Var = this.b;
        p6Var.setBounds(0, dp3, width2, height2);
        p6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b || super.verifyDrawable(drawable);
    }
}
