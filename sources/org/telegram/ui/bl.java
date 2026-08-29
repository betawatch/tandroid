package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bl extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ tn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(tn tnVar, Activity activity) {
        super(activity);
        this.c = tnVar;
        setOnLongClickListener(new w(this, 2));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        tn tnVar = this.c;
        if (view == tnVar.v2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.h5[] h5VarArr = tnVar.z2;
        if (view != h5VarArr[0] && view != h5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == tnVar.v2) {
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
        tn tnVar = this.c;
        if (!tnVar.w2) {
            return;
        }
        int i12 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = tnVar.D2;
            if (i12 >= animatorSetArr.length) {
                tnVar.w2 = false;
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
        tn tnVar = this.c;
        if (action == 1) {
            tnVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f9 = this.b - this.a;
            tnVar.movePreviewFragment(f9);
            if (f9 < 0.0f) {
                this.b = this.a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
