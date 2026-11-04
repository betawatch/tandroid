package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jk extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ wm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(wm wmVar, Activity activity) {
        super(activity);
        this.c = wmVar;
        setOnLongClickListener(new t(this, 2));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wm wmVar = this.c;
        if (view == wmVar.O2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f));
        }
        org.telegram.ui.ActionBar.k5[] k5VarArr = wmVar.S2;
        if (view != k5VarArr[0] && view != k5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == wmVar.O2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        wm wmVar = this.c;
        if (!wmVar.P2) {
            return;
        }
        int i11 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = wmVar.W2;
            if (i11 >= animatorSetArr.length) {
                wmVar.P2 = false;
                return;
            }
            AnimatorSet animatorSet = animatorSetArr[i11];
            if (animatorSet != null) {
                animatorSet.start();
            }
            i11++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.a = motionEvent.getY();
        int action = motionEvent.getAction();
        wm wmVar = this.c;
        if (action == 1) {
            wmVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.b - this.a;
            wmVar.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.b = this.a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
