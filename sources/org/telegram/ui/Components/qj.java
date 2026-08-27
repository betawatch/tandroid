package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qj extends zk0 {
    public final /* synthetic */ int T2;
    public final Paint U2;
    public final /* synthetic */ bk V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(bk bkVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.T2 = i10;
        switch (i10) {
            case 1:
                this.V2 = bkVar;
                super(context, c6Var);
                this.U2 = new Paint();
                break;
            default:
                this.V2 = bkVar;
                this.U2 = new Paint();
                break;
        }
    }

    @Override // org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.T2) {
            case 0:
                if (this.V2.n == 2 && getChildCount() > 0) {
                    float f10 = 2.14748365E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f10) {
                            f10 = getChildAt(i10).getY();
                        }
                    }
                    this.U2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
            default:
                if (this.V2.n == 1 && getChildCount() > 0) {
                    float f11 = 2.14748365E9f;
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (getChildAt(i11).getY() < f11) {
                            f11 = getChildAt(i11).getY();
                        }
                    }
                    this.U2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
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
