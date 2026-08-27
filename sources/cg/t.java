package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.p71;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t extends p71 {
    public final Path P;
    public final Paint Q;
    public boolean R;
    public boolean S;
    public final boolean T;
    public final /* synthetic */ i2 U;
    public final /* synthetic */ c6 V;
    public final /* synthetic */ d1 W;
    public final /* synthetic */ x a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, Context context, i2 i2Var, c6 c6Var, d1 d1Var) {
        super(context, null);
        this.a0 = xVar;
        this.U = i2Var;
        this.V = c6Var;
        this.W = d1Var;
        this.P = new Path();
        this.Q = new Paint(1);
        this.T = AndroidUtilities.isTablet();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        x xVar = this.a0;
        t tVar = xVar.b;
        int v02 = g6.v0(g6.h5, this.V);
        Paint paint = this.Q;
        paint.setColor(v02);
        if (!this.R) {
            if (this.T || xVar.d) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i10 = -AndroidUtilities.dp(16.0f);
        d1 d1Var = this.W;
        int dp = AndroidUtilities.dp(10.0f) + Math.max(i10, d1Var.o0 - (d1Var.e.getVisibility() == 0 ? AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight : 0));
        i2 i2Var = this.U;
        int max = Math.max(0, i2Var.p0 - (i2Var.i0.c == 1.0f ? AndroidUtilities.statusBarHeight : 0));
        int abs = Math.abs(dp - max);
        if (tVar.getCurrentPosition() == 0) {
            float positionAnimated = tVar.getPositionAnimated() * abs;
            f10 = dp < max ? dp + positionAnimated : dp - positionAnimated;
        } else {
            float positionAnimated2 = (1.0f - tVar.getPositionAnimated()) * abs;
            f10 = max < dp ? max + positionAnimated2 : max - positionAnimated2;
        }
        int i11 = (int) f10;
        float dp2 = AndroidUtilities.dp(14.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, i11, getWidth(), AndroidUtilities.dp(8.0f) + getHeight());
        canvas.drawRoundRect(rectF, dp2, dp2, paint);
        canvas.save();
        Path path = this.P;
        path.rewind();
        path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.p71
    public final float getAvailableTranslationX() {
        return (this.T || this.a0.d) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override // org.telegram.ui.Components.p71
    public final boolean i(MotionEvent motionEvent) {
        return this.a0.b.getCurrentPosition() == 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.S;
        x xVar = this.a0;
        if (z11 != xVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = xVar.isKeyboardVisible();
            this.S = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.U.X(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.p71
    public final void u() {
        this.R = false;
        this.a0.b.invalidate();
    }

    @Override // org.telegram.ui.Components.p71
    public final void w(boolean z10) {
        x xVar = this.a0;
        t tVar = xVar.b;
        float positionAnimated = tVar.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.R = false;
        } else if (!this.R) {
            this.R = true;
            if (xVar.isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(xVar.c.getContainerView());
            }
        }
        tVar.invalidate();
    }
}
