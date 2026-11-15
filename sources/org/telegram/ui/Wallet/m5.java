package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class m5 extends h6 {
    public final /* synthetic */ y5 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(y5 y5Var, Context context) {
        super(context);
        this.m0 = y5Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i7, makeMeasureSpec);
        y5 y5Var = this.m0;
        if (y5Var.r <= 0 || getMeasuredHeight() <= y5Var.r) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, y5Var.r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), makeMeasureSpec);
    }

    @Override // org.telegram.ui.Wallet.h6
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        y5 y5Var = this.m0;
        y5Var.V0(y5Var.y0);
        y5Var.W0(fArr);
    }
}
