package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hs extends org.telegram.ui.Cells.v8 {
    public final /* synthetic */ int W = 2;
    public final /* synthetic */ Object a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(js jsVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.a0 = jsVar;
    }

    @Override // org.telegram.ui.Cells.v8
    public int e(int i10) {
        switch (this.W) {
            case 2:
                ProfileActivity profileActivity = ((j01) this.a0).e;
                int i11 = ProfileActivity.R6;
                profileActivity.getClass();
                break;
        }
        return i10;
    }

    @Override // org.telegram.ui.Cells.v8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.W) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                js jsVar = (js) this.a0;
                int measuredHeight2 = (measuredHeight - jsVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.y9 y9Var = jsVar.U;
                y9Var.layout(dp, measuredHeight2, y9Var.getMeasuredWidth() + dp, jsVar.U.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                kx0 kx0Var = (kx0) this.a0;
                int measuredHeight4 = (measuredHeight3 - kx0Var.d.u0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.y9 y9Var2 = kx0Var.d.u0;
                y9Var2.layout(dp2, measuredHeight4, y9Var2.getMeasuredWidth() + dp2, kx0Var.d.u0.getMeasuredHeight() + measuredHeight4);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.v8, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.W) {
            case 0:
                super.onMeasure(i10, i11);
                js jsVar = (js) this.a0;
                jsVar.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                jsVar.U.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            case 1:
                super.onMeasure(i10, i11);
                kx0 kx0Var = (kx0) this.a0;
                kx0Var.d.u0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                kx0Var.d.u0.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(kx0 kx0Var, Activity activity) {
        super(activity);
        this.a0 = kx0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(j01 j01Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(18, context, u6Var, false, false);
        this.a0 = j01Var;
    }
}
