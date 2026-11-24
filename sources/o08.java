// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o08 extends tmb {
    public final /* synthetic */ byte I = 1;

    public /* synthetic */ o08(Context context, ui5 ui5Var, int i) {
        super(context, ui5Var, i);
    }

    public final /* synthetic */ void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.I) {
            case 0:
                if (!canvas.isHardwareAccelerated()) {
                    zdc.a(canvas, this, new zf7(this, (byte) 10));
                    break;
                } else {
                    super.draw(canvas);
                    break;
                }
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // tmb, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.I) {
            case 1:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public /* synthetic */ o08(Context context, ui5 ui5Var, int i, long j, wjb wjbVar) {
        super(context, ui5Var, i, j, wjbVar);
    }
}
