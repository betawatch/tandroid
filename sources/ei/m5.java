package ei;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m5 extends b5.l {
    public boolean x0;
    public final /* synthetic */ s5 y0;
    public final /* synthetic */ s5 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(s5 s5Var, Context context) {
        super(context);
        this.z0 = s5Var;
        this.y0 = s5Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.x0 = true;
        }
        if (this.x0 && this.y0.y <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.x0 = true;
        }
        if (!this.x0 || this.y0.y > 0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y9 = motionEvent.getY();
        currentTopOffset = this.z0.getCurrentTopOffset();
        if (y9 >= currentTopOffset || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // b5.l, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y9 = motionEvent.getY();
        s5 s5Var = this.z0;
        currentTopOffset = s5Var.getCurrentTopOffset();
        if (y9 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = s5Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - s5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // b5.l, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y9 = motionEvent.getY();
        s5 s5Var = this.z0;
        currentTopOffset = s5Var.getCurrentTopOffset();
        if (y9 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = s5Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - s5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
            return false;
        }
        return B(motionEvent);
    }
}
