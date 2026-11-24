// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class k2a extends ggc {
    public boolean x0;
    public final /* synthetic */ p2a y0;
    public final /* synthetic */ p2a z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2a(p2a p2aVar, Context context) {
        super(context);
        this.z0 = p2aVar;
        this.y0 = p2aVar;
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
        float y = motionEvent.getY();
        currentTopOffset = this.z0.getCurrentTopOffset();
        if (y >= currentTopOffset || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // ggc, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y = motionEvent.getY();
        p2a p2aVar = this.z0;
        currentTopOffset = p2aVar.getCurrentTopOffset();
        if (y < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = p2aVar.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - p2aVar.d) > gm.L(1.0f)) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // ggc, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y = motionEvent.getY();
        p2a p2aVar = this.z0;
        currentTopOffset = p2aVar.getCurrentTopOffset();
        if (y < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = p2aVar.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - p2aVar.d) > gm.L(1.0f)) {
            return false;
        }
        return B(motionEvent);
    }
}
