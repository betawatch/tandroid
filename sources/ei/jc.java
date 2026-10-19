package ei;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class jc extends View {
    public final uj0 a;
    public final org.telegram.ui.Components.p6 b;
    public final Paint c;
    public final Paint d;
    public final yc e;
    public boolean f;
    public final org.telegram.ui.Components.f6 h;

    public jc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new yc(this);
        bs bsVar = bs.h;
        this.h = new org.telegram.ui.Components.f6(this, 0L, 240L, bsVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        uj0 uj0Var = new uj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.a = uj0Var;
        uj0Var.R(this);
        uj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        uj0Var.h = true;
        uj0Var.P(0);
        uj0Var.J(true);
        uj0Var.start();
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, true, false);
        this.b = p6Var;
        p6Var.n(0.3f, 250L, bsVar);
        p6Var.M = AndroidUtilities.displaySize.x;
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.u(-1);
        p6Var.s(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), TLObject.FLAG_30);
        p6Var.t(LocaleController.getString(R.string.TrashHintDrag), true, true);
        p6Var.b = 17;
    }

    public final void a(boolean z10, boolean z11) {
        this.e.c(z10);
        this.b.t(LocaleController.getString((z10 || z11) ? R.string.TrashHintRelease : R.string.TrashHintDrag), true, true);
        boolean z12 = z10 && !z11;
        this.f = z12;
        uj0 uj0Var = this.a;
        if (z12) {
            if (uj0Var.a0 > 34) {
                uj0Var.N(0, false, false);
            }
            uj0Var.P(33);
            uj0Var.start();
        } else {
            uj0Var.P(z11 ? 66 : 0);
            uj0Var.start();
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e = (this.h.e(this.f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e, this.d);
        canvas.drawCircle(width, height, e, this.c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        uj0 uj0Var = this.a;
        uj0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        uj0Var.draw(canvas);
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
