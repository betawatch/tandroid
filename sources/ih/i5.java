package ih;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i5 extends m2.g {
    public boolean s0;
    public final /* synthetic */ o5 t0;
    public final /* synthetic */ o5 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(o5 o5Var, Context context) {
        super(context);
        this.u0 = o5Var;
        this.t0 = o5Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.s0 = true;
        }
        if (this.s0 && this.t0.x <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.s0 = true;
        }
        if (!this.s0 || this.t0.x > 0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y10 = motionEvent.getY();
        currentTopOffset = this.u0.getCurrentTopOffset();
        if (y10 >= currentTopOffset || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // m2.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y10 = motionEvent.getY();
        o5 o5Var = this.u0;
        currentTopOffset = o5Var.getCurrentTopOffset();
        if (y10 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = o5Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - o5Var.d) > AndroidUtilities.dp(1.0f)) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // m2.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y10 = motionEvent.getY();
        o5 o5Var = this.u0;
        currentTopOffset = o5Var.getCurrentTopOffset();
        if (y10 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = o5Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - o5Var.d) > AndroidUtilities.dp(1.0f)) {
            return false;
        }
        return B(motionEvent);
    }
}
