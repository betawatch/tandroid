package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class or extends org.telegram.ui.Cells.m8 {
    public final /* synthetic */ int W = 1;
    public final /* synthetic */ Object a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(qr qrVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.a0 = qrVar;
    }

    @Override // org.telegram.ui.Cells.m8
    public int e(int i7) {
        switch (this.W) {
            case 2:
                ProfileActivity profileActivity = ((mw0) this.a0).e;
                RectF rectF = ProfileActivity.V6;
                profileActivity.getClass();
                break;
        }
        return i7;
    }

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.W) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                int L = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight = getMeasuredHeight();
                qr qrVar = (qr) this.a0;
                int measuredHeight2 = (measuredHeight - qrVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.k9 k9Var = qrVar.U;
                k9Var.layout(L, measuredHeight2, k9Var.getMeasuredWidth() + L, qrVar.U.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                int L2 = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                mt0 mt0Var = (mt0) this.a0;
                int measuredHeight4 = (measuredHeight3 - mt0Var.d.w0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.k9 k9Var2 = mt0Var.d.w0;
                k9Var2.layout(L2, measuredHeight4, k9Var2.getMeasuredWidth() + L2, mt0Var.d.w0.getMeasuredHeight() + measuredHeight4);
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.W) {
            case 0:
                super.onMeasure(i7, i10);
                qr qrVar = (qr) this.a0;
                qrVar.U.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
                qrVar.U.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                break;
            case 1:
                super.onMeasure(i7, i10);
                mt0 mt0Var = (mt0) this.a0;
                mt0Var.d.w0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
                mt0Var.d.w0.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(mt0 mt0Var, Activity activity) {
        super(activity);
        this.a0 = mt0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(mw0 mw0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(18, context, h6Var, false, false);
        this.a0 = mw0Var;
    }
}
