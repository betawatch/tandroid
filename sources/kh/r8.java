package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class r8 extends FrameLayout {
    public final Paint a;
    public final org.telegram.ui.Components.y5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;
    public final /* synthetic */ u8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(u8 u8Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.d = u8Var;
        this.c = b6Var;
        this.a = new Paint(1);
        this.b = new org.telegram.ui.Components.y5(this, 0L, 350L, gr.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        int i10;
        int i11;
        int i12;
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, this.c);
        Paint paint = this.a;
        paint.setColor(v02);
        u8 u8Var = this.d;
        float max = Math.max(0.0f, u8Var.s());
        boolean z10 = max < ((float) AndroidUtilities.statusBarHeight);
        org.telegram.ui.Components.y5 y5Var = this.b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, y5Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        i9 = ((org.telegram.ui.ActionBar.f3) u8Var).backgroundPaddingLeft;
        int width = getWidth();
        i10 = ((org.telegram.ui.ActionBar.f3) u8Var).backgroundPaddingLeft;
        rectF.set(i9, lerp, width - i10, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - y5Var.c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        u8Var.n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i11 = ((org.telegram.ui.ActionBar.f3) u8Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i12 = ((org.telegram.ui.ActionBar.f3) u8Var).backgroundPaddingLeft;
        canvas.clipRect(i11, dp2, width2 - i12, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        u8 u8Var = this.d;
        if (y10 >= u8Var.s()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        u8Var.dismiss();
        return true;
    }
}
