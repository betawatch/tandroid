// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class b4a extends fic {
    public boolean x0;
    public final /* synthetic */ g4a y0;
    public final /* synthetic */ g4a z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4a(g4a g4aVar, Context context) {
        super(context);
        this.z0 = g4aVar;
        this.y0 = g4aVar;
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

    @Override // fic, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y = motionEvent.getY();
        g4a g4aVar = this.z0;
        currentTopOffset = g4aVar.getCurrentTopOffset();
        if (y < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = g4aVar.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - g4aVar.d) > hl.L(1.0f)) {
            return false;
        }
        return A(motionEvent);
    }

    @Override // fic, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y = motionEvent.getY();
        g4a g4aVar = this.z0;
        currentTopOffset = g4aVar.getCurrentTopOffset();
        if (y < currentTopOffset) {
            return false;
        }
        currentTopOffset2 = g4aVar.getCurrentTopOffset();
        if (Math.abs(currentTopOffset2 - g4aVar.d) > hl.L(1.0f)) {
            return false;
        }
        return B(motionEvent);
    }
}
