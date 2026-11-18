package hi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class fa extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final /* synthetic */ ta d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(ta taVar, Activity activity) {
        super(activity);
        this.d = taVar;
        this.a = new Rect();
        this.b = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 31 || !canvas.isHardwareAccelerated() || org.telegram.messenger.g0.m0) {
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
        if (!z10 || i7 < 31) {
            return;
        }
        this.c.endRecording();
        org.telegram.ui.Components.ca caVar = this.d.s0;
        if (caVar != null) {
            caVar.g(this, this.c);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
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
        ta taVar = this.d;
        wd0 wd0Var = taVar.G1;
        if (wd0Var != null) {
            float measuredWidth = wd0Var.getMeasuredWidth();
            float measuredHeight = taVar.G1.getMeasuredHeight();
            yi0 yi0Var = wd0Var.e;
            yi0Var.a = 0.0f;
            yi0Var.b = 0.0f;
            yi0Var.c = measuredWidth;
            yi0Var.d = measuredHeight;
        }
        ud0 ud0Var = taVar.F1;
        if (ud0Var != null) {
            float measuredWidth2 = ud0Var.getMeasuredWidth();
            float measuredHeight2 = taVar.F1.getMeasuredHeight();
            vt0 vt0Var = ud0Var.d;
            vt0Var.a = measuredWidth2;
            vt0Var.b = measuredHeight2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.FrameLayout, hi.pa] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.w2;
        if (r02 == 0) {
            return super.onTouchEvent(motionEvent);
        }
        r02.i(motionEvent);
        return true;
    }
}
