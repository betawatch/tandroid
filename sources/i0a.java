// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class i0a extends gec {
    public boolean x0;
    public final /* synthetic */ n0a y0;
    public final /* synthetic */ n0a z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0a(n0a n0aVar, Context context) {
        super(context);
        this.z0 = n0aVar;
        this.y0 = n0aVar;
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

    @Override // gec, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y = motionEvent.getY();
        n0a n0aVar = this.z0;
        currentTopOffset = n0aVar.getCurrentTopOffset();
        if (y < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = n0aVar.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - n0aVar.d) > gl.L(1.0f)) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // gec, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y = motionEvent.getY();
        n0a n0aVar = this.z0;
        currentTopOffset = n0aVar.getCurrentTopOffset();
        if (y < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = n0aVar.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - n0aVar.d) > gl.L(1.0f)) {
            return false;
        }
        return B(motionEvent);
    }
}
