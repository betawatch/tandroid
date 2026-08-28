package kh;

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
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.wj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class ib extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final /* synthetic */ wb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(wb wbVar, Activity activity) {
        super(activity);
        this.d = wbVar;
        this.a = new Rect();
        this.b = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 31 || !canvas.isHardwareAccelerated() || AndroidUtilities.makingGlobalBlurBitmap) {
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
        if (!z10 || i9 < 31) {
            return;
        }
        this.c.endRecording();
        org.telegram.ui.Components.ba baVar = this.d.n0;
        if (baVar != null) {
            baVar.g(this, this.c);
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (Build.VERSION.SDK_INT >= 29) {
            int i13 = i11 - i9;
            int i14 = i12 - i10;
            int dp = i14 - AndroidUtilities.dp(120.0f);
            int dp2 = AndroidUtilities.dp(40.0f);
            Rect rect = this.a;
            rect.set(0, dp, dp2, i14);
            int dp3 = i13 - AndroidUtilities.dp(40.0f);
            int dp4 = i14 - AndroidUtilities.dp(120.0f);
            Rect rect2 = this.b;
            rect2.set(dp3, dp4, i13, i14);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        wb wbVar = this.d;
        he0 he0Var = wbVar.B1;
        if (he0Var != null) {
            float measuredWidth = he0Var.getMeasuredWidth();
            float measuredHeight = wbVar.B1.getMeasuredHeight();
            wj0 wj0Var = he0Var.e;
            wj0Var.a = 0.0f;
            wj0Var.b = 0.0f;
            wj0Var.c = measuredWidth;
            wj0Var.d = measuredHeight;
        }
        fe0 fe0Var = wbVar.A1;
        if (fe0Var != null) {
            float measuredWidth2 = fe0Var.getMeasuredWidth();
            float measuredHeight2 = wbVar.A1.getMeasuredHeight();
            qu0 qu0Var = fe0Var.d;
            qu0Var.a = measuredWidth2;
            qu0Var.b = measuredHeight2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.FrameLayout, kh.sb] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.r2;
        if (r02 == 0) {
            return super.onTouchEvent(motionEvent);
        }
        r02.m(motionEvent);
        return true;
    }
}
