// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ms1 extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ zu1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms1(zu1 zu1Var, Activity activity) {
        super(activity);
        this.c = zu1Var;
        setOnLongClickListener(new zs(this, (byte) 2));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        zu1 zu1Var = this.c;
        if (view == zu1Var.O2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), hl.L(48.0f));
        }
        ema[] emaVarArr = zu1Var.S2;
        if (view != emaVarArr[0] && view != emaVarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j);
            if (view == zu1Var.O2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - hl.L(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        zu1 zu1Var = this.c;
        if (!zu1Var.P2) {
            return;
        }
        int i3 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = zu1Var.W2;
            if (i3 >= animatorSetArr.length) {
                zu1Var.P2 = false;
                return;
            }
            AnimatorSet animatorSet = animatorSetArr[i3];
            if (animatorSet != null) {
                animatorSet.start();
            }
            i3++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.a = motionEvent.getY();
        int action = motionEvent.getAction();
        zu1 zu1Var = this.c;
        if (action == 1) {
            zu1Var.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f = this.b - this.a;
            zu1Var.movePreviewFragment(f);
            if (f < 0.0f) {
                this.b = this.a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
