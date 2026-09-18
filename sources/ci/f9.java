package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class f9 extends FrameLayout {
    public final Paint a;
    public final org.telegram.ui.Components.c6 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ i9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(i9 i9Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = i9Var;
        this.c = f6Var;
        this.a = new Paint(1);
        this.b = new org.telegram.ui.Components.c6(this, 0L, 350L, qr.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, this.c);
        Paint paint = this.a;
        paint.setColor(v02);
        i9 i9Var = this.d;
        float max = Math.max(0.0f, i9Var.s());
        boolean z10 = max < ((float) AndroidUtilities.statusBarHeight);
        org.telegram.ui.Components.c6 c6Var = this.b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, c6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.g3) i9Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.g3) i9Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - c6Var.c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        i9Var.n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.g3) i9Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.g3) i9Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y3 = motionEvent.getY();
        i9 i9Var = this.d;
        if (y3 >= i9Var.s()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        i9Var.dismiss();
        return true;
    }
}
