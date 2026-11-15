package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class rj extends uj0 {
    public final /* synthetic */ int f3;
    public final Paint g3;
    public final /* synthetic */ dk h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(dk dkVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.f3 = i7;
        switch (i7) {
            case 1:
                this.h3 = dkVar;
                super(context, e6Var);
                this.g3 = new Paint();
                break;
            default:
                this.h3 = dkVar;
                this.g3 = new Paint();
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f3) {
            case 0:
                if (this.h3.n == 2 && getChildCount() > 0) {
                    float f10 = 2.14748365E9f;
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        if (getChildAt(i7).getY() < f10) {
                            f10 = getChildAt(i7).getY();
                        }
                    }
                    this.g3.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
            default:
                if (this.h3.n == 1 && getChildCount() > 0) {
                    float f11 = 2.14748365E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f11) {
                            f11 = getChildAt(i10).getY();
                        }
                    }
                    this.g3.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 0:
                if (this.h3.n == 0) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
