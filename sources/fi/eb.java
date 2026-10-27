package fi;

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
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.vf0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class eb extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final /* synthetic */ sb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(sb sbVar, Activity activity) {
        super(activity);
        this.d = sbVar;
        this.a = new Rect();
        this.b = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 || !canvas.isHardwareAccelerated() || AndroidUtilities.makingGlobalBlurBitmap) {
            z10 = false;
            canvas2 = canvas;
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
        org.telegram.ui.Components.la laVar = this.d.r0;
        if (laVar != null) {
            laVar.g(this, this.c);
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
        sb sbVar = this.d;
        vf0 vf0Var = sbVar.F1;
        if (vf0Var != null) {
            float measuredWidth = vf0Var.getMeasuredWidth();
            float measuredHeight = sbVar.F1.getMeasuredHeight();
            il0 il0Var = vf0Var.e;
            il0Var.a = 0.0f;
            il0Var.b = 0.0f;
            il0Var.c = measuredWidth;
            il0Var.d = measuredHeight;
        }
        tf0 tf0Var = sbVar.E1;
        if (tf0Var != null) {
            float measuredWidth2 = tf0Var.getMeasuredWidth();
            float measuredHeight2 = sbVar.E1.getMeasuredHeight();
            rw0 rw0Var = tf0Var.d;
            rw0Var.a = measuredWidth2;
            rw0Var.b = measuredHeight2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.FrameLayout, fi.ob] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.v2;
        if (r02 == 0) {
            return super.onTouchEvent(motionEvent);
        }
        r02.j(motionEvent);
        return true;
    }
}
