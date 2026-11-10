package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class n5 extends i6 {
    public final /* synthetic */ z5 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(z5 z5Var, Context context) {
        super(context);
        this.l0 = z5Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        super.onMeasure(i7, makeMeasureSpec);
        z5 z5Var = this.l0;
        if (z5Var.r <= 0 || getMeasuredHeight() <= z5Var.r) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, z5Var.r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), makeMeasureSpec);
    }

    @Override // org.telegram.ui.Wallet.i6
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        z5 z5Var = this.l0;
        z5Var.V0(z5Var.x0);
        z5Var.W0(fArr);
    }
}
