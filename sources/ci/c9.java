package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class c9 extends FrameLayout {
    public final Paint a;
    public final org.telegram.ui.Components.e6 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ f9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(f9 f9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = f9Var;
        this.c = d6Var;
        this.a = new Paint(1);
        this.b = new org.telegram.ui.Components.e6(this, 0L, 350L, rr.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, this.c);
        Paint paint = this.a;
        paint.setColor(v02);
        f9 f9Var = this.d;
        float max = Math.max(0.0f, f9Var.s());
        boolean z10 = max < ((float) AndroidUtilities.statusBarHeight);
        org.telegram.ui.Components.e6 e6Var = this.b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, e6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.e3) f9Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.e3) f9Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - e6Var.c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        f9Var.n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.e3) f9Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.e3) f9Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y3 = motionEvent.getY();
        f9 f9Var = this.d;
        if (y3 >= f9Var.s()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        f9Var.dismiss();
        return true;
    }
}
