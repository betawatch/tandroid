package lh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class f5 extends m2.g {
    public boolean s0;
    public final /* synthetic */ l5 t0;
    public final /* synthetic */ l5 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(l5 l5Var, Context context) {
        super(context);
        this.u0 = l5Var;
        this.t0 = l5Var;
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
        float y8 = motionEvent.getY();
        currentTopOffset = this.u0.getCurrentTopOffset();
        if (y8 >= currentTopOffset || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // m2.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y8 = motionEvent.getY();
        l5 l5Var = this.u0;
        currentTopOffset = l5Var.getCurrentTopOffset();
        if (y8 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = l5Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - l5Var.d) > AndroidUtilities.dp(1.0f)) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // m2.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y8 = motionEvent.getY();
        l5 l5Var = this.u0;
        currentTopOffset = l5Var.getCurrentTopOffset();
        if (y8 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = l5Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - l5Var.d) > AndroidUtilities.dp(1.0f)) {
            return false;
        }
        return B(motionEvent);
    }
}
