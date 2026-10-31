package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lj extends tk0 {
    public final /* synthetic */ int e3;
    public final Paint f3;
    public final /* synthetic */ xj g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(xj xjVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.e3 = i10;
        switch (i10) {
            case 1:
                this.g3 = xjVar;
                super(context, p6Var);
                this.f3 = new Paint();
                break;
            default:
                this.g3 = xjVar;
                this.f3 = new Paint();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.e3) {
            case 0:
                if (this.g3.n == 2 && getChildCount() > 0) {
                    float f7 = 2.14748365E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f7) {
                            f7 = getChildAt(i10).getY();
                        }
                    }
                    this.f3.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
            default:
                if (this.g3.n == 1 && getChildCount() > 0) {
                    float f10 = 2.14748365E9f;
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (getChildAt(i11).getY() < f10) {
                            f10 = getChildAt(i11).getY();
                        }
                    }
                    this.f3.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 0:
                if (this.g3.n == 0) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
