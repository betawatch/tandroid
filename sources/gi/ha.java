package gi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.ni0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        boolean z10;
        Canvas canvas2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 || !canvas.isHardwareAccelerated() || org.telegram.messenger.g0.m0) {
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
        if (!z10 || i3 < 31) {
            return;
        }
        this.c.endRecording();
        org.telegram.ui.Components.x9 x9Var = this.d.s0;
        if (x9Var != null) {
            x9Var.g(this, this.c);
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (Build.VERSION.SDK_INT >= 29) {
            int i13 = i11 - i3;
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        va vaVar = this.d;
        gd0 gd0Var = vaVar.G1;
        if (gd0Var != null) {
            float measuredWidth = gd0Var.getMeasuredWidth();
            float measuredHeight = vaVar.G1.getMeasuredHeight();
            ni0 ni0Var = gd0Var.e;
            ni0Var.a = 0.0f;
            ni0Var.b = 0.0f;
            ni0Var.c = measuredWidth;
            ni0Var.d = measuredHeight;
        }
        ed0 ed0Var = vaVar.F1;
        if (ed0Var != null) {
            float measuredWidth2 = ed0Var.getMeasuredWidth();
            float measuredHeight2 = vaVar.F1.getMeasuredHeight();
            lt0 lt0Var = ed0Var.d;
            lt0Var.a = measuredWidth2;
            lt0Var.b = measuredHeight2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.FrameLayout, gi.ra] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.w2;
        if (r02 == 0) {
            return super.onTouchEvent(motionEvent);
        }
        r02.j(motionEvent);
        return true;
    }
}
