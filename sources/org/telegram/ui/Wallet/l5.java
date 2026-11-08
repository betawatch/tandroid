package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class l5 extends g6 {
    public final /* synthetic */ x5 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(x5 x5Var, Context context) {
        super(context);
        this.l0 = x5Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i7, makeMeasureSpec);
        x5 x5Var = this.l0;
        if (x5Var.r <= 0 || getMeasuredHeight() <= x5Var.r) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, x5Var.r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), makeMeasureSpec);
    }

    @Override // org.telegram.ui.Wallet.g6
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        x5 x5Var = this.l0;
        x5Var.U0(x5Var.x0);
        x5Var.V0(fArr);
    }
}
