// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class ebb extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final /* synthetic */ rbb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebb(rbb rbbVar, Activity activity) {
        super(activity);
        this.d = rbbVar;
        this.a = new Rect();
        this.b = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        Canvas canvas2;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 || !canvas.isHardwareAccelerated() || hl.m0) {
            z = false;
            canvas2 = canvas;
        } else {
            RenderNode renderNode = this.c;
            if (renderNode == null) {
                renderNode = new RenderNode("StoryRecorder.PreviewView");
                this.c = renderNode;
            }
            renderNode.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = this.c.beginRecording();
            z = true;
        }
        super.dispatchDraw(canvas2);
        if (!z || i < 31) {
            return;
        }
        this.c.endRecording();
        tl0 tl0Var = this.d.s0;
        if (tl0Var != null) {
            tl0Var.g(this, this.c);
        }
        canvas.drawRenderNode(this.c);
    }

    @Override // android.view.View
    public final void invalidate() {
        ValueAnimator valueAnimator = this.d.F;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            int L = i6 - hl.L(120.0f);
            int L2 = hl.L(40.0f);
            Rect rect = this.a;
            rect.set(0, L, L2, i6);
            int L3 = i5 - hl.L(40.0f);
            int L4 = i6 - hl.L(120.0f);
            Rect rect2 = this.b;
            rect2.set(L3, L4, i5, i6);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        rbb rbbVar = this.d;
        v88 v88Var = rbbVar.G1;
        if (v88Var != null) {
            float measuredWidth = v88Var.getMeasuredWidth();
            float measuredHeight = rbbVar.G1.getMeasuredHeight();
            a69 a69Var = v88Var.e;
            a69Var.a = 0.0f;
            a69Var.b = 0.0f;
            a69Var.c = measuredWidth;
            a69Var.d = measuredHeight;
        }
        t88 t88Var = rbbVar.F1;
        if (t88Var != null) {
            float measuredWidth2 = t88Var.getMeasuredWidth();
            float measuredHeight2 = rbbVar.F1.getMeasuredHeight();
            qma qmaVar = t88Var.d;
            qmaVar.a = measuredWidth2;
            qmaVar.b = measuredHeight2;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        nbb nbbVar = this.d.w2;
        if (nbbVar == null) {
            return super.onTouchEvent(motionEvent);
        }
        nbbVar.h(motionEvent);
        return true;
    }
}
