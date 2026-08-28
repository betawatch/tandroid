package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.n71;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w extends n71 {
    public final Path P;
    public final Paint Q;
    public boolean R;
    public boolean S;
    public final boolean T;
    public final /* synthetic */ q2 U;
    public final /* synthetic */ b6 V;
    public final /* synthetic */ h1 W;
    public final /* synthetic */ a0 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a0 a0Var, Context context, q2 q2Var, b6 b6Var, h1 h1Var) {
        super(context, null);
        this.a0 = a0Var;
        this.U = q2Var;
        this.V = b6Var;
        this.W = h1Var;
        this.P = new Path();
        this.Q = new Paint(1);
        this.T = AndroidUtilities.isTablet();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        a0 a0Var = this.a0;
        w wVar = a0Var.b;
        int v02 = f6.v0(f6.h5, this.V);
        Paint paint = this.Q;
        paint.setColor(v02);
        if (!this.R) {
            if (this.T || a0Var.d) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i9 = -AndroidUtilities.dp(16.0f);
        h1 h1Var = this.W;
        int dp = AndroidUtilities.dp(10.0f) + Math.max(i9, h1Var.o0 - (h1Var.e.getVisibility() == 0 ? AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight : 0));
        q2 q2Var = this.U;
        int max = Math.max(0, q2Var.p0 - (q2Var.i0.c == 1.0f ? AndroidUtilities.statusBarHeight : 0));
        int abs = Math.abs(dp - max);
        if (wVar.getCurrentPosition() == 0) {
            float positionAnimated = wVar.getPositionAnimated() * abs;
            f10 = dp < max ? dp + positionAnimated : dp - positionAnimated;
        } else {
            float positionAnimated2 = (1.0f - wVar.getPositionAnimated()) * abs;
            f10 = max < dp ? max + positionAnimated2 : max - positionAnimated2;
        }
        int i10 = (int) f10;
        float dp2 = AndroidUtilities.dp(14.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, i10, getWidth(), AndroidUtilities.dp(8.0f) + getHeight());
        canvas.drawRoundRect(rectF, dp2, dp2, paint);
        canvas.save();
        Path path = this.P;
        path.rewind();
        path.addRoundRect(rectF, dp2, dp2, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.n71
    public final float getAvailableTranslationX() {
        return (this.T || this.a0.d) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override // org.telegram.ui.Components.n71
    public final boolean i(MotionEvent motionEvent) {
        return this.a0.b.getCurrentPosition() == 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        boolean z11 = this.S;
        a0 a0Var = this.a0;
        if (z11 != a0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = a0Var.isKeyboardVisible();
            this.S = isKeyboardVisible;
            if (isKeyboardVisible) {
                this.U.W(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final void u() {
        this.R = false;
        this.a0.b.invalidate();
    }

    @Override // org.telegram.ui.Components.n71
    public final void w(boolean z10) {
        a0 a0Var = this.a0;
        w wVar = a0Var.b;
        float positionAnimated = wVar.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.R = false;
        } else if (!this.R) {
            this.R = true;
            if (a0Var.isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(a0Var.c.getContainerView());
            }
        }
        wVar.invalidate();
    }
}
