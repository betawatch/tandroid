package lh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class fc extends View {
    public final oi0 a;
    public final org.telegram.ui.Components.i6 b;
    public final Paint c;
    public final Paint d;
    public final org.telegram.ui.Components.nc e;
    public boolean f;
    public final org.telegram.ui.Components.y5 h;

    public fc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new org.telegram.ui.Components.nc(this);
        er erVar = er.h;
        this.h = new org.telegram.ui.Components.y5(this, 0L, 240L, erVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        oi0 oi0Var = new oi0(R.raw.group_pip_delete_icon, "" + R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.a = oi0Var;
        oi0Var.r0 = this;
        oi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        oi0Var.h = true;
        oi0Var.N(0);
        oi0Var.H(true);
        oi0Var.start();
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, false, false);
        this.b = i6Var;
        i6Var.k(0.3f, 250L, erVar);
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.r(-1);
        i6Var.p(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), TLObject.FLAG_30);
        i6Var.q(LocaleController.getString(R.string.TrashHintDrag), true, true);
        i6Var.b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        this.e.c(z10);
        this.b.q(LocaleController.getString((z10 || z11) ? R.string.TrashHintRelease : R.string.TrashHintDrag), true, true);
        boolean z12 = z10 && !z11;
        this.f = z12;
        oi0 oi0Var = this.a;
        if (z12) {
            if (oi0Var.X > 34) {
                oi0Var.L(0, false, false);
            }
            oi0Var.N(33);
            oi0Var.start();
        } else {
            oi0Var.N(z11 ? 66 : 0);
            oi0Var.start();
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e9 = (this.h.e(this.f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e9, this.d);
        canvas.drawCircle(width, height, e9, this.c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        oi0 oi0Var = this.a;
        oi0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        oi0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.i6 i6Var = this.b;
        i6Var.setBounds(0, dp3, width2, height2);
        i6Var.draw(canvas);
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
