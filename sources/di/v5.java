package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class v5 extends a5.m {
    public boolean w0;
    public final /* synthetic */ b6 x0;
    public final /* synthetic */ b6 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(b6 b6Var, Context context) {
        super(context);
        this.y0 = b6Var;
        this.x0 = b6Var;
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

    @Override // a5.m, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y3 = motionEvent.getY();
        b6 b6Var = this.y0;
        currentTopOffset = b6Var.getCurrentTopOffset();
        if (y3 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = b6Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - b6Var.d) > AndroidUtilities.dp(1.0f)) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // a5.m, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y3 = motionEvent.getY();
        b6 b6Var = this.y0;
        currentTopOffset = b6Var.getCurrentTopOffset();
        if (y3 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = b6Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - b6Var.d) > AndroidUtilities.dp(1.0f)) {
            return false;
        }
        return B(motionEvent);
    }
}
