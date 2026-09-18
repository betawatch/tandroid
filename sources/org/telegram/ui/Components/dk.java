package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dk extends ml0 {
    public final /* synthetic */ int X2;
    public final Paint Y2;
    public final /* synthetic */ ok Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(ok okVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        switch (i10) {
            case 1:
                this.Z2 = okVar;
                super(context, f6Var);
                this.Y2 = new Paint();
                break;
            default:
                this.Z2 = okVar;
                this.Y2 = new Paint();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ml0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.X2) {
            case 0:
                if (this.Z2.n == 2 && getChildCount() > 0) {
                    float f7 = 2.14748365E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f7) {
                            f7 = getChildAt(i10).getY();
                        }
                    }
                    this.Y2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
            default:
                if (this.Z2.n == 1 && getChildCount() > 0) {
                    float f10 = 2.14748365E9f;
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (getChildAt(i11).getY() < f10) {
                            f10 = getChildAt(i11).getY();
                        }
                    }
                    this.Y2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 0:
                if (this.Z2.n == 0) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
