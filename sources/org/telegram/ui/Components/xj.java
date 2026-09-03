package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xj extends sl0 {
    public final /* synthetic */ int U2;
    public final Paint V2;
    public final /* synthetic */ jk W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(jk jkVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.U2 = i10;
        switch (i10) {
            case 1:
                this.W2 = jkVar;
                super(context, g6Var);
                this.V2 = new Paint();
                break;
            default:
                this.W2 = jkVar;
                this.V2 = new Paint();
                break;
        }
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.U2) {
            case 0:
                if (this.W2.n == 2 && getChildCount() > 0) {
                    float f10 = 2.14748365E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f10) {
                            f10 = getChildAt(i10).getY();
                        }
                    }
                    this.V2.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
            default:
                if (this.W2.n == 1 && getChildCount() > 0) {
                    float f11 = 2.14748365E9f;
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (getChildAt(i11).getY() < f11) {
                            f11 = getChildAt(i11).getY();
                        }
                    }
                    this.V2.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 0:
                if (this.W2.n == 0) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
