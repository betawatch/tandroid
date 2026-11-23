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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.xt0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class za extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final /* synthetic */ nb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(nb nbVar, Activity activity) {
        super(activity);
        this.d = nbVar;
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
        org.telegram.ui.Components.ba baVar = this.d.s0;
        if (baVar != null) {
            baVar.g(this, this.c);
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
        nb nbVar = this.d;
        wd0 wd0Var = nbVar.G1;
        if (wd0Var != null) {
            float measuredWidth = wd0Var.getMeasuredWidth();
            float measuredHeight = nbVar.G1.getMeasuredHeight();
            aj0 aj0Var = wd0Var.e;
            aj0Var.a = 0.0f;
            aj0Var.b = 0.0f;
            aj0Var.c = measuredWidth;
            aj0Var.d = measuredHeight;
        }
        ud0 ud0Var = nbVar.F1;
        if (ud0Var != null) {
            float measuredWidth2 = ud0Var.getMeasuredWidth();
            float measuredHeight2 = nbVar.F1.getMeasuredHeight();
            xt0 xt0Var = ud0Var.d;
            xt0Var.a = measuredWidth2;
            xt0Var.b = measuredHeight2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.FrameLayout, hi.jb] */
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
