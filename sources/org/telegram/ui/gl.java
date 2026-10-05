package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class gl extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ yn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(yn ynVar, Activity activity) {
        super(activity);
        this.c = ynVar;
        setOnLongClickListener(new v(this, 2));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        yn ynVar = this.c;
        if (view == ynVar.x2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.i5[] i5VarArr = ynVar.B2;
        if (view != i5VarArr[0] && view != i5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (view == ynVar.x2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - AndroidUtilities.dp(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        yn ynVar = this.c;
        if (!ynVar.y2) {
            return;
        }
        int i12 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = ynVar.F2;
            if (i12 >= animatorSetArr.length) {
                ynVar.y2 = false;
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
        yn ynVar = this.c;
        if (action == 1) {
            ynVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.b - this.a;
            ynVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.b = this.a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
