package oh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h5 extends m2.h {
    public boolean t0;
    public final /* synthetic */ n5 u0;
    public final /* synthetic */ n5 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(n5 n5Var, Context context) {
        super(context);
        this.v0 = n5Var;
        this.u0 = n5Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.t0 = true;
        }
        if (this.t0 && this.u0.x <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.t0 = true;
        }
        if (!this.t0 || this.u0.x > 0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y10 = motionEvent.getY();
        currentTopOffset = this.v0.getCurrentTopOffset();
        if (y10 >= currentTopOffset || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // m2.h, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y10 = motionEvent.getY();
        n5 n5Var = this.v0;
        currentTopOffset = n5Var.getCurrentTopOffset();
        if (y10 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = n5Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - n5Var.d) > AndroidUtilities.dp(1.0f)) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // m2.h, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y10 = motionEvent.getY();
        n5 n5Var = this.v0;
        currentTopOffset = n5Var.getCurrentTopOffset();
        if (y10 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = n5Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - n5Var.d) > AndroidUtilities.dp(1.0f)) {
            return false;
        }
        return B(motionEvent);
    }
}
