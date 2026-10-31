package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class in0 extends org.telegram.ui.Cells.z9 {
    public final /* synthetic */ int H = 1;

    public /* synthetic */ in0(Context context, org.telegram.ui.ActionBar.z4 z4Var, int i10) {
        super(context, z4Var, i10);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.H) {
            case 0:
                if (!canvas.isHardwareAccelerated()) {
                    rf.e0.a(canvas, this, new s3(this, 16));
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

    @Override // org.telegram.ui.Cells.z9, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 1:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public /* synthetic */ in0(Context context, org.telegram.ui.ActionBar.z4 z4Var, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, z4Var, i10, j10, p6Var);
    }
}
