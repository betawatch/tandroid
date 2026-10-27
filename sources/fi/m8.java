package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class m8 extends FrameLayout {
    public final Paint a;
    public final org.telegram.ui.Components.h6 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 c;
    public final /* synthetic */ p8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(p8 p8Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = p8Var;
        this.c = u6Var;
        this.a = new Paint(1);
        this.b = new org.telegram.ui.Components.h6(this, 0L, 350L, ds.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, this.c);
        Paint paint = this.a;
        paint.setColor(w02);
        p8 p8Var = this.d;
        float max = Math.max(0.0f, p8Var.s());
        boolean z10 = max < ((float) AndroidUtilities.statusBarHeight);
        org.telegram.ui.Components.h6 h6Var = this.b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, h6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.k3) p8Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.k3) p8Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - h6Var.c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        p8Var.n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.k3) p8Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.k3) p8Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y3 = motionEvent.getY();
        p8 p8Var = this.d;
        if (y3 >= p8Var.s()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        p8Var.dismiss();
        return true;
    }
}
