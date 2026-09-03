package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jl extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ zn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(zn znVar, Activity activity) {
        super(activity);
        this.c = znVar;
        setOnLongClickListener(new w(this, 2));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        zn znVar = this.c;
        if (view == znVar.w2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.k5[] k5VarArr = znVar.A2;
        if (view != k5VarArr[0] && view != k5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == znVar.w2) {
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
        zn znVar = this.c;
        if (!znVar.x2) {
            return;
        }
        int i12 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = znVar.E2;
            if (i12 >= animatorSetArr.length) {
                znVar.x2 = false;
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
        zn znVar = this.c;
        if (action == 1) {
            znVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.b - this.a;
            znVar.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.b = this.a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
