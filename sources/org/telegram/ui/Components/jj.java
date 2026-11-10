package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jj extends pj0 {
    public final /* synthetic */ int e3;
    public final Paint f3;
    public final /* synthetic */ uj g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(uj ujVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.e3 = i7;
        switch (i7) {
            case 1:
                this.g3 = ujVar;
                super(context, h6Var);
                this.f3 = new Paint();
                break;
            default:
                this.g3 = ujVar;
                this.f3 = new Paint();
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.e3) {
            case 0:
                if (this.g3.n == 2 && getChildCount() > 0) {
                    float f10 = 2.14748365E9f;
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        if (getChildAt(i7).getY() < f10) {
                            f10 = getChildAt(i7).getY();
                        }
                    }
                    this.f3.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
            default:
                if (this.g3.n == 1 && getChildCount() > 0) {
                    float f11 = 2.14748365E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f11) {
                            f11 = getChildAt(i10).getY();
                        }
                    }
                    this.f3.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
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
