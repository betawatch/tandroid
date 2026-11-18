package fi;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class c5 extends c5.l {
    public boolean x0;
    public final /* synthetic */ i5 y0;
    public final /* synthetic */ i5 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(i5 i5Var, Context context) {
        super(context);
        this.z0 = i5Var;
        this.y0 = i5Var;
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
        float y10 = motionEvent.getY();
        currentTopOffset = this.z0.getCurrentTopOffset();
        if (y10 >= currentTopOffset || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // c5.l, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y10 = motionEvent.getY();
        i5 i5Var = this.z0;
        currentTopOffset = i5Var.getCurrentTopOffset();
        if (y10 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = i5Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - i5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // c5.l, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y10 = motionEvent.getY();
        i5 i5Var = this.z0;
        currentTopOffset = i5Var.getCurrentTopOffset();
        if (y10 < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = i5Var.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - i5Var.d) > org.telegram.messenger.g0.L(1.0f)) {
            return false;
        }
        return B(motionEvent);
    }
}
