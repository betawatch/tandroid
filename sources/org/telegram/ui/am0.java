package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class am0 extends org.telegram.ui.Cells.ba {
    public final /* synthetic */ int I = 1;

    public /* synthetic */ am0(Context context, org.telegram.ui.ActionBar.r4 r4Var, int i7) {
        super(context, r4Var, i7);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.I) {
            case 0:
                if (!canvas.isHardwareAccelerated()) {
                    bg.u0.a(canvas, this, new r3(this, 18));
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

    @Override // org.telegram.ui.Cells.ba, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.I) {
            case 1:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public /* synthetic */ am0(Context context, org.telegram.ui.ActionBar.r4 r4Var, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, r4Var, i7, j3, h6Var);
    }
}
