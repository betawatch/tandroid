package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uj extends wk0 {
    public final /* synthetic */ int T2;
    public final Paint U2;
    public final /* synthetic */ fk V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(fk fkVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.T2 = i9;
        switch (i9) {
            case 1:
                this.V2 = fkVar;
                super(context, b6Var);
                this.U2 = new Paint();
                break;
            default:
                this.V2 = fkVar;
                this.U2 = new Paint();
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.T2) {
            case 0:
                if (this.V2.n == 2 && getChildCount() > 0) {
                    float f10 = 2.14748365E9f;
                    for (int i9 = 0; i9 < getChildCount(); i9++) {
                        if (getChildAt(i9).getY() < f10) {
                            f10 = getChildAt(i9).getY();
                        }
                    }
                    this.U2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
            default:
                if (this.V2.n == 1 && getChildCount() > 0) {
                    float f11 = 2.14748365E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f11) {
                            f11 = getChildAt(i10).getY();
                        }
                    }
                    this.U2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 0:
                if (this.V2.n == 0) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
