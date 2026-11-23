package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class c6 extends y6 {
    public final /* synthetic */ o6 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(o6 o6Var, Context context) {
        super(context);
        this.m0 = o6Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i7, makeMeasureSpec);
        o6 o6Var = this.m0;
        if (o6Var.r <= 0 || getMeasuredHeight() <= o6Var.r) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, o6Var.r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), makeMeasureSpec);
    }

    @Override // org.telegram.ui.Wallet.y6
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        o6 o6Var = this.m0;
        o6Var.Z0(o6Var.A0);
        o6Var.a1(fArr);
    }
}
