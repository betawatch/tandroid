package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vj extends sl0 {
    public final /* synthetic */ int U2;
    public final Paint V2;
    public final /* synthetic */ hk W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(hk hkVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.U2 = i10;
        switch (i10) {
            case 1:
                this.W2 = hkVar;
                super(context, f6Var);
                this.V2 = new Paint();
                break;
            default:
                this.W2 = hkVar;
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
                    this.V2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
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
                    this.V2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
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
