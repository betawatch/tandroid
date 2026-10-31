package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jl extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ un c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(un unVar, Activity activity) {
        super(activity);
        this.c = unVar;
        setOnLongClickListener(new s(this, 2));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        un unVar = this.c;
        if (view == unVar.N2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), org.telegram.messenger.i0.L(48.0f));
        }
        org.telegram.ui.ActionBar.u5[] u5VarArr = unVar.R2;
        if (view != u5VarArr[0] && view != u5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == unVar.N2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - org.telegram.messenger.i0.L(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        un unVar = this.c;
        if (!unVar.O2) {
            return;
        }
        int i12 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = unVar.V2;
            if (i12 >= animatorSetArr.length) {
                unVar.O2 = false;
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
        un unVar = this.c;
        if (action == 1) {
            unVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.b - this.a;
            unVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.b = this.a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
