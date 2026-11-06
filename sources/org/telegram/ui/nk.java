package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class nk extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ an c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(an anVar, Activity activity) {
        super(activity);
        this.c = anVar;
        setOnLongClickListener(new t(this, 2));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        an anVar = this.c;
        if (view == anVar.N2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f));
        }
        org.telegram.ui.ActionBar.k5[] k5VarArr = anVar.R2;
        if (view != k5VarArr[0] && view != k5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (view == anVar.N2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        an anVar = this.c;
        if (!anVar.O2) {
            return;
        }
        int i11 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = anVar.V2;
            if (i11 >= animatorSetArr.length) {
                anVar.O2 = false;
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
        an anVar = this.c;
        if (action == 1) {
            anVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.b - this.a;
            anVar.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.b = this.a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
