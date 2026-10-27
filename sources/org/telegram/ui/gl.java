package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gl extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ wn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(wn wnVar, Activity activity) {
        super(activity);
        this.c = wnVar;
        setOnLongClickListener(new t(this, 2));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wn wnVar = this.c;
        if (view == wnVar.L2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.b6[] b6VarArr = wnVar.P2;
        if (view != b6VarArr[0] && view != b6VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == wnVar.L2) {
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
        wn wnVar = this.c;
        if (!wnVar.M2) {
            return;
        }
        int i12 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = wnVar.T2;
            if (i12 >= animatorSetArr.length) {
                wnVar.M2 = false;
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
        wn wnVar = this.c;
        if (action == 1) {
            wnVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f7 = this.b - this.a;
            wnVar.movePreviewFragment(f7);
            if (f7 < 0.0f) {
                this.b = this.a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
