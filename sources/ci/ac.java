package ci;

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
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.ye0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class ac extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final /* synthetic */ oc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(oc ocVar, Activity activity) {
        super(activity);
        this.d = ocVar;
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
        org.telegram.ui.Components.ha haVar = this.d.r0;
        if (haVar != null) {
            haVar.g(this, this.c);
        }
        canvas.drawRenderNode(this.c);
    }

    @Override // android.view.View
    public final void invalidate() {
        ValueAnimator valueAnimator = this.d.E;
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
        oc ocVar = this.d;
        af0 af0Var = ocVar.F1;
        if (af0Var != null) {
            float measuredWidth = af0Var.getMeasuredWidth();
            float measuredHeight = ocVar.F1.getMeasuredHeight();
            ik0 ik0Var = af0Var.e;
            ik0Var.a = 0.0f;
            ik0Var.b = 0.0f;
            ik0Var.c = measuredWidth;
            ik0Var.d = measuredHeight;
        }
        ye0 ye0Var = ocVar.E1;
        if (ye0Var != null) {
            float measuredWidth2 = ye0Var.getMeasuredWidth();
            float measuredHeight2 = ocVar.E1.getMeasuredHeight();
            kv0 kv0Var = ye0Var.d;
            kv0Var.a = measuredWidth2;
            kv0Var.b = measuredHeight2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.FrameLayout, ci.kc] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.v2;
        if (r02 == 0) {
            return super.onTouchEvent(motionEvent);
        }
        r02.m(motionEvent);
        return true;
    }
}
