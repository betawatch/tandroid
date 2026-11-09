package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class pk extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ cn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(cn cnVar, Activity activity) {
        super(activity);
        this.c = cnVar;
        setOnLongClickListener(new t(this, 2));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        cn cnVar = this.c;
        if (view == cnVar.N2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f));
        }
        org.telegram.ui.ActionBar.l5[] l5VarArr = cnVar.R2;
        if (view != l5VarArr[0] && view != l5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (view == cnVar.N2) {
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
        cn cnVar = this.c;
        if (!cnVar.O2) {
            return;
        }
        int i11 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = cnVar.V2;
            if (i11 >= animatorSetArr.length) {
                cnVar.O2 = false;
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
        cn cnVar = this.c;
        if (action == 1) {
            cnVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.b - this.a;
            cnVar.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.b = this.a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
