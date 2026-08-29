package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e8 extends FrameLayout {
    public final Paint a;
    public final org.telegram.ui.Components.d6 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ h8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(h8 h8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = h8Var;
        this.c = c6Var;
        this.a = new Paint(1);
        this.b = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, this.c);
        Paint paint = this.a;
        paint.setColor(v02);
        h8 h8Var = this.d;
        float max = Math.max(0.0f, h8Var.s());
        boolean z10 = max < ((float) AndroidUtilities.statusBarHeight);
        org.telegram.ui.Components.d6 d6Var = this.b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, d6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) h8Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) h8Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - d6Var.c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        h8Var.n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.f3) h8Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.f3) h8Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y8 = motionEvent.getY();
        h8 h8Var = this.d;
        if (y8 >= h8Var.s()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        h8Var.dismiss();
        return true;
    }
}
