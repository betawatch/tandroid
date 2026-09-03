package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hl extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ xn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(xn xnVar, Activity activity) {
        super(activity);
        this.c = xnVar;
        setOnLongClickListener(new w(this, 2));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        xn xnVar = this.c;
        if (view == xnVar.w2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.l5[] l5VarArr = xnVar.A2;
        if (view != l5VarArr[0] && view != l5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == xnVar.w2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - AndroidUtilities.dp(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        xn xnVar = this.c;
        if (!xnVar.x2) {
            return;
        }
        int i12 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = xnVar.E2;
            if (i12 >= animatorSetArr.length) {
                xnVar.x2 = false;
                return;
            }
            AnimatorSet animatorSet = animatorSetArr[i12];
            if (animatorSet != null) {
                animatorSet.start();
            }
            i12++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.a = motionEvent.getY();
        int action = motionEvent.getAction();
        xn xnVar = this.c;
        if (action == 1) {
            xnVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.b - this.a;
            xnVar.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.b = this.a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
