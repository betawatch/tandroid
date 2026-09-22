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
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.wv0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        org.telegram.ui.Components.ia iaVar = this.d.r0;
        if (iaVar != null) {
            iaVar.g(this, this.c);
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
        lf0 lf0Var = ocVar.F1;
        if (lf0Var != null) {
            float measuredWidth = lf0Var.getMeasuredWidth();
            float measuredHeight = ocVar.F1.getMeasuredHeight();
            uk0 uk0Var = lf0Var.e;
            uk0Var.a = 0.0f;
            uk0Var.b = 0.0f;
            uk0Var.c = measuredWidth;
            uk0Var.d = measuredHeight;
        }
        jf0 jf0Var = ocVar.E1;
        if (jf0Var != null) {
            float measuredWidth2 = jf0Var.getMeasuredWidth();
            float measuredHeight2 = ocVar.E1.getMeasuredHeight();
            wv0 wv0Var = jf0Var.d;
            wv0Var.a = measuredWidth2;
            wv0Var.b = measuredHeight2;
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
