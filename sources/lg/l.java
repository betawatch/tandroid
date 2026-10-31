package lg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l implements GestureDetector.OnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public l(q qVar, int i10) {
        this.b = qVar;
        this.a = i10;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        q qVar = this.b;
        ValueAnimator valueAnimator = qVar.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            qVar.c0.cancel();
            qVar.c0 = null;
        }
        AnimatorSet animatorSet = qVar.d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            qVar.d0.cancel();
            qVar.d0 = null;
        }
        i0.r(qVar.e0);
        qVar.a = true;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.b.h();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        int i10 = this.a;
        q qVar = this.b;
        if (i10 == 4) {
            h hVar = qVar.b;
            hVar.d -= f7 * 0.5f;
            hVar.i -= f10 * 0.05f;
            return true;
        }
        h hVar2 = qVar.b;
        hVar2.d = (f7 * 0.5f) + hVar2.d;
        hVar2.i = (f10 * 0.05f) + hVar2.i;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.b;
        i0.h3(new k(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, 0), 16L);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
