package ai;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class l7 extends z4.g {
    public boolean w0;
    public final /* synthetic */ r7 x0;
    public final /* synthetic */ r7 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(r7 r7Var, Context context) {
        super(context);
        this.y0 = r7Var;
        this.x0 = r7Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.w0 = true;
        }
        if (this.w0 && this.x0.x <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.w0 = true;
        }
        if (!this.w0 || this.x0.x > 0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y3 = motionEvent.getY();
        currentTopOffset = this.y0.getCurrentTopOffset();
        if (y3 >= currentTopOffset || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // z4.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y3 = motionEvent.getY();
        r7 r7Var = this.y0;
        currentTopOffset = r7Var.getCurrentTopOffset();
        if (y3 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = r7Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - r7Var.d) > AndroidUtilities.dp(1.0f)) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // z4.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y3 = motionEvent.getY();
        r7 r7Var = this.y0;
        currentTopOffset = r7Var.getCurrentTopOffset();
        if (y3 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = r7Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - r7Var.d) > AndroidUtilities.dp(1.0f)) {
            return false;
        }
        return B(motionEvent);
    }
}
