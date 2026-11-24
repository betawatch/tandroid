// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class g7b extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final /* synthetic */ t7b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7b(t7b t7bVar, Context context) {
        super(context);
        this.d = t7bVar;
        this.a = new Rect();
        this.b = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        Canvas canvas2;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 || !canvas.isHardwareAccelerated() || gl.m0) {
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
        sl0 sl0Var = this.d.s0;
        if (sl0Var != null) {
            sl0Var.g(this, this.c);
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
            int L = i6 - gl.L(120.0f);
            int L2 = gl.L(40.0f);
            Rect rect = this.a;
            rect.set(0, L, L2, i6);
            int L3 = i5 - gl.L(40.0f);
            int L4 = i6 - gl.L(120.0f);
            Rect rect2 = this.b;
            rect2.set(L3, L4, i5, i6);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        t7b t7bVar = this.d;
        e58 e58Var = t7bVar.G1;
        if (e58Var != null) {
            float measuredWidth = e58Var.getMeasuredWidth();
            float measuredHeight = t7bVar.G1.getMeasuredHeight();
            l29 l29Var = e58Var.e;
            l29Var.a = 0.0f;
            l29Var.b = 0.0f;
            l29Var.c = measuredWidth;
            l29Var.d = measuredHeight;
        }
        c58 c58Var = t7bVar.F1;
        if (c58Var != null) {
            float measuredWidth2 = c58Var.getMeasuredWidth();
            float measuredHeight2 = t7bVar.F1.getMeasuredHeight();
            via viaVar = c58Var.d;
            viaVar.a = measuredWidth2;
            viaVar.b = measuredHeight2;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p7b p7bVar = this.d.w2;
        if (p7bVar == null) {
            return super.onTouchEvent(motionEvent);
        }
        p7bVar.h(motionEvent);
        return true;
    }
}
