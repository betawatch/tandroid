package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.m81;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class t extends m81 {
    public final Path Q;
    public final Paint R;
    public boolean S;
    public boolean T;
    public final boolean U;
    public final /* synthetic */ f2 V;
    public final /* synthetic */ g6 W;
    public final /* synthetic */ b1 a0;
    public final /* synthetic */ x b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, Context context, f2 f2Var, g6 g6Var, b1 b1Var) {
        super(context, null);
        this.b0 = xVar;
        this.V = f2Var;
        this.W = g6Var;
        this.a0 = b1Var;
        this.Q = new Path();
        this.R = new Paint(1);
        this.U = AndroidUtilities.isTablet();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        x xVar = this.b0;
        t tVar = xVar.b;
        int v02 = k6.v0(k6.h5, this.W);
        Paint paint = this.R;
        paint.setColor(v02);
        if (!this.S) {
            if (this.U || xVar.d) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i10 = -AndroidUtilities.dp(16.0f);
        b1 b1Var = this.a0;
        int dp = AndroidUtilities.dp(10.0f) + Math.max(i10, b1Var.p0 - (b1Var.e.getVisibility() == 0 ? AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight : 0));
        f2 f2Var = this.V;
        int max = Math.max(0, f2Var.q0 - (f2Var.j0.c == 1.0f ? AndroidUtilities.statusBarHeight : 0));
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
        Path path = this.Q;
        path.rewind();
        path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.m81
    public final float getAvailableTranslationX() {
        return (this.U || this.b0.d) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override // org.telegram.ui.Components.m81
    public final boolean i(MotionEvent motionEvent) {
        return this.b0.b.getCurrentPosition() == 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        boolean z10 = this.T;
        x xVar = this.b0;
        if (z10 != xVar.isKeyboardVisible()) {
            boolean isKeyboardVisible = xVar.isKeyboardVisible();
            this.T = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.V.X(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.m81
    public final void u() {
        this.S = false;
        this.b0.b.invalidate();
    }

    @Override // org.telegram.ui.Components.m81
    public final void w(boolean z4) {
        x xVar = this.b0;
        t tVar = xVar.b;
        float positionAnimated = tVar.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.S = false;
        } else if (!this.S) {
            this.S = true;
            if (xVar.isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(xVar.c.getContainerView());
            }
        }
        tVar.invalidate();
    }
}
