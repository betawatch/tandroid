package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class am0 extends org.telegram.ui.Cells.aa {
    public final /* synthetic */ int I = 1;

    public /* synthetic */ am0(Context context, org.telegram.ui.ActionBar.s4 s4Var, int i7) {
        super(context, s4Var, i7);
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

    @Override // org.telegram.ui.Cells.aa, android.view.ViewGroup
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

    public /* synthetic */ am0(Context context, org.telegram.ui.ActionBar.s4 s4Var, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, s4Var, i7, j3, i6Var);
    }
}
