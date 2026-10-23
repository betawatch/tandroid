package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l91;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class i5 extends l91 {
    public final /* synthetic */ l7 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(l7 l7Var, Context context) {
        super(context, null);
        this.T = l7Var;
    }

    @Override // org.telegram.ui.Components.l91
    public final void E(View view, float f7) {
        int i10;
        View view2;
        yh.k2 k2Var;
        yh.k2 k2Var2;
        l5 l5Var;
        l5 l5Var2;
        l5 l5Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        l7 l7Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.h3) l7Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f7);
        view.setPivotX(clamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                k2Var = l7Var.c0;
                if (k2Var != null && view2 == k2Var.Y && (l5Var3 = k2Var.e0) != null) {
                    l5Var3.invalidate();
                }
                if (view2 == l7Var.Y && (l5Var2 = l7Var.e0) != null) {
                    l5Var2.invalidate();
                }
                k2Var2 = l7Var.d0;
                if (k2Var2 == null && view2 == k2Var2.Y && (l5Var = k2Var2.e0) != null) {
                    l5Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        k2Var = l7Var.c0;
        if (k2Var != null) {
            l5Var3.invalidate();
        }
        if (view2 == l7Var.Y) {
            l5Var2.invalidate();
        }
        k2Var2 = l7Var.d0;
        if (k2Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.l91
    public final void F() {
        super.F();
        int i10 = this.b;
        l7 l7Var = this.T;
        if (i10 != l7Var.f2(false)) {
            AndroidUtilities.runOnUIThread(new ah.t(3, this, this.b > l7Var.f2(false)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        canvas.save();
        l7 l7Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.h3) l7Var).backgroundPaddingLeft;
        int i12 = -getHeight();
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.h3) l7Var).backgroundPaddingLeft;
        canvas.clipRect(i10, i12, width - i11, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.l91
    public final float getAvailableTranslationX() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        i10 = ((org.telegram.ui.ActionBar.h3) this.T).backgroundPaddingLeft;
        return Math.max(1, measuredWidth - (i10 * 2));
    }

    @Override // org.telegram.ui.Components.l91
    public final boolean i(MotionEvent motionEvent) {
        h6 h6Var = this.T.b1;
        return h6Var == null || h6Var.c(0);
    }
}
