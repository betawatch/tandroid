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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class i9b extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final /* synthetic */ v9b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9b(v9b v9bVar, Activity activity) {
        super(activity);
        this.d = v9bVar;
        this.a = new Rect();
        this.b = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        Canvas canvas2;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 || !canvas.isHardwareAccelerated() || gm.m0) {
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
        sm0 sm0Var = this.d.s0;
        if (sm0Var != null) {
            sm0Var.g(this, this.c);
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
            int L = i6 - gm.L(120.0f);
            int L2 = gm.L(40.0f);
            Rect rect = this.a;
            rect.set(0, L, L2, i6);
            int L3 = i5 - gm.L(40.0f);
            int L4 = i6 - gm.L(120.0f);
            Rect rect2 = this.b;
            rect2.set(L3, L4, i5, i6);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        v9b v9bVar = this.d;
        g78 g78Var = v9bVar.G1;
        if (g78Var != null) {
            float measuredWidth = g78Var.getMeasuredWidth();
            float measuredHeight = v9bVar.G1.getMeasuredHeight();
            o49 o49Var = g78Var.e;
            o49Var.a = 0.0f;
            o49Var.b = 0.0f;
            o49Var.c = measuredWidth;
            o49Var.d = measuredHeight;
        }
        e78 e78Var = v9bVar.F1;
        if (e78Var != null) {
            float measuredWidth2 = e78Var.getMeasuredWidth();
            float measuredHeight2 = v9bVar.F1.getMeasuredHeight();
            xka xkaVar = e78Var.d;
            xkaVar.a = measuredWidth2;
            xkaVar.b = measuredHeight2;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r9b r9bVar = this.d.w2;
        if (r9bVar == null) {
            return super.onTouchEvent(motionEvent);
        }
        r9bVar.h(motionEvent);
        return true;
    }
}
