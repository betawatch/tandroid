package di;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class m5 extends c5.k {
    public boolean w0;
    public final /* synthetic */ s5 x0;
    public final /* synthetic */ s5 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(s5 s5Var, Context context) {
        super(context);
        this.y0 = s5Var;
        this.x0 = s5Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.w0 = true;
        }
        if (this.w0 && this.x0.y <= 0) {
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
        if (!this.w0 || this.x0.y > 0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y10 = motionEvent.getY();
        currentTopOffset = this.y0.getCurrentTopOffset();
        if (y10 >= currentTopOffset || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // c5.k, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y10 = motionEvent.getY();
        s5 s5Var = this.y0;
        currentTopOffset = s5Var.getCurrentTopOffset();
        if (y10 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = s5Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - s5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // c5.k, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y10 = motionEvent.getY();
        s5 s5Var = this.y0;
        currentTopOffset = s5Var.getCurrentTopOffset();
        if (y10 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = s5Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - s5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
            return false;
        }
        return B(motionEvent);
    }
}
