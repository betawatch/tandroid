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
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.mt0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ha extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final /* synthetic */ va d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(va vaVar, Activity activity) {
        super(activity);
        this.d = vaVar;
        this.a = new Rect();
        this.b = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        Canvas canvas2;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 31 || !canvas.isHardwareAccelerated() || org.telegram.messenger.g0.m0) {
            z9 = false;
            canvas2 = canvas;
        } else {
            if (this.c == null) {
                this.c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.c.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = this.c.beginRecording();
            z9 = true;
        }
        super.dispatchDraw(canvas2);
        if (!z9 || i7 < 31) {
            return;
        }
        this.c.endRecording();
        org.telegram.ui.Components.y9 y9Var = this.d.r0;
        if (y9Var != null) {
            y9Var.g(this, this.c);
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (Build.VERSION.SDK_INT >= 29) {
            int i13 = i11 - i7;
            int i14 = i12 - i10;
            int L = i14 - org.telegram.messenger.g0.L(120.0f);
            int L2 = org.telegram.messenger.g0.L(40.0f);
            Rect rect = this.a;
            rect.set(0, L, L2, i14);
            int L3 = i13 - org.telegram.messenger.g0.L(40.0f);
            int L4 = i14 - org.telegram.messenger.g0.L(120.0f);
            Rect rect2 = this.b;
            rect2.set(L3, L4, i13, i14);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        va vaVar = this.d;
        ld0 ld0Var = vaVar.F1;
        if (ld0Var != null) {
            float measuredWidth = ld0Var.getMeasuredWidth();
            float measuredHeight = vaVar.F1.getMeasuredHeight();
            ki0 ki0Var = ld0Var.e;
            ki0Var.a = 0.0f;
            ki0Var.b = 0.0f;
            ki0Var.c = measuredWidth;
            ki0Var.d = measuredHeight;
        }
        jd0 jd0Var = vaVar.E1;
        if (jd0Var != null) {
            float measuredWidth2 = jd0Var.getMeasuredWidth();
            float measuredHeight2 = vaVar.E1.getMeasuredHeight();
            mt0 mt0Var = jd0Var.d;
            mt0Var.a = measuredWidth2;
            mt0Var.b = measuredHeight2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.FrameLayout, fi.ra] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.v2;
        if (r02 == 0) {
            return super.onTouchEvent(motionEvent);
        }
        r02.i(motionEvent);
        return true;
    }
}
