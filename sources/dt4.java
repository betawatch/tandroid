// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class dt4 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ it4 b;

    /* JADX WARN: Multi-variable type inference failed */
    public dt4(it4 it4Var, int i) {
        this.b = it4Var;
        this.a = i;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        it4 it4Var = this.b;
        ValueAnimator valueAnimator = it4Var.d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            it4Var.d0.cancel();
            it4Var.d0 = null;
        }
        AnimatorSet animatorSet = it4Var.e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            it4Var.e0.cancel();
            it4Var.e0 = null;
        }
        hl.r(it4Var.f0);
        it4Var.a = true;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.b.g();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ys4 ys4Var = this.b.b;
        if (this.a == 4) {
            ys4Var.d -= f * 0.5f;
            ys4Var.i -= f2 * 0.05f;
            return true;
        }
        ys4Var.d = (f * 0.5f) + ys4Var.d;
        ys4Var.i = (f2 * 0.05f) + ys4Var.i;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.b;
        hl.d3(new ct4(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, (byte) 0), 16L);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
