package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class fk extends yl0 {
    public final /* synthetic */ int X2;
    public final Paint Y2;
    public final /* synthetic */ qk Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(qk qkVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.X2 = i10;
        switch (i10) {
            case 1:
                this.Z2 = qkVar;
                super(context, d6Var);
                this.Y2 = new Paint();
                break;
            default:
                this.Z2 = qkVar;
                this.Y2 = new Paint();
                break;
        }
    }

    @Override // org.telegram.ui.Components.yl0, android.view.ViewGroup, android.view.View
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
                    this.Y2.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h5, false));
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
                    this.Y2.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.View
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
