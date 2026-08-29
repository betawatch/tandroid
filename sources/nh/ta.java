package nh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.ve0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class ta extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final /* synthetic */ gb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(gb gbVar, Activity activity) {
        super(activity);
        this.d = gbVar;
        this.a = new Rect();
        this.b = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 || !canvas.isHardwareAccelerated() || AndroidUtilities.makingGlobalBlurBitmap) {
            canvas2 = canvas;
            z10 = false;
        } else {
            if (this.c == null) {
                this.c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.c.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = this.c.beginRecording();
            z10 = true;
        }
        super.dispatchDraw(canvas2);
        if (!z10 || i10 < 31) {
            return;
        }
        this.c.endRecording();
        org.telegram.ui.Components.ga gaVar = this.d.n0;
        if (gaVar != null) {
            gaVar.g(this, this.c);
        }
        canvas.drawRenderNode(this.c);
    }

    @Override // android.view.View
    public final void invalidate() {
        ValueAnimator valueAnimator = this.d.A;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT >= 29) {
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            int dp = i15 - AndroidUtilities.dp(120.0f);
            int dp2 = AndroidUtilities.dp(40.0f);
            Rect rect = this.a;
            rect.set(0, dp, dp2, i15);
            int dp3 = i14 - AndroidUtilities.dp(40.0f);
            int dp4 = i15 - AndroidUtilities.dp(120.0f);
            Rect rect2 = this.b;
            rect2.set(dp3, dp4, i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        gb gbVar = this.d;
        ve0 ve0Var = gbVar.B1;
        if (ve0Var != null) {
            float measuredWidth = ve0Var.getMeasuredWidth();
            float measuredHeight = gbVar.B1.getMeasuredHeight();
            hk0 hk0Var = ve0Var.e;
            hk0Var.a = 0.0f;
            hk0Var.b = 0.0f;
            hk0Var.c = measuredWidth;
            hk0Var.d = measuredHeight;
        }
        te0 te0Var = gbVar.A1;
        if (te0Var != null) {
            float measuredWidth2 = te0Var.getMeasuredWidth();
            float measuredHeight2 = gbVar.A1.getMeasuredHeight();
            bv0 bv0Var = te0Var.d;
            bv0Var.a = measuredWidth2;
            bv0Var.b = measuredHeight2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.FrameLayout, nh.cb] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.r2;
        if (r02 == 0) {
            return super.onTouchEvent(motionEvent);
        }
        r02.l(motionEvent);
        return true;
    }
}
