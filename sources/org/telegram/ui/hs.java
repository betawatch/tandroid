package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hs extends org.telegram.ui.Cells.l8 {
    public final /* synthetic */ int M = 0;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(js jsVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.N = jsVar;
    }

    @Override // org.telegram.ui.Cells.l8
    public int c(int i10) {
        switch (this.M) {
            case 2:
                ((vz0) this.N).e.getClass();
                break;
        }
        return i10;
    }

    @Override // org.telegram.ui.Cells.l8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.M) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                js jsVar = (js) this.N;
                int measuredHeight2 = (measuredHeight - jsVar.Q.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.n9 n9Var = jsVar.Q;
                n9Var.layout(dp, measuredHeight2, n9Var.getMeasuredWidth() + dp, jsVar.Q.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                uw0 uw0Var = (uw0) this.N;
                int measuredHeight4 = (measuredHeight3 - uw0Var.d.r0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.n9 n9Var2 = uw0Var.d.r0;
                n9Var2.layout(dp2, measuredHeight4, n9Var2.getMeasuredWidth() + dp2, uw0Var.d.r0.getMeasuredHeight() + measuredHeight4);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l8, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.M) {
            case 0:
                super.onMeasure(i10, i11);
                js jsVar = (js) this.N;
                jsVar.Q.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                jsVar.Q.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            case 1:
                super.onMeasure(i10, i11);
                uw0 uw0Var = (uw0) this.N;
                uw0Var.d.r0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                uw0Var.d.r0.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(uw0 uw0Var, Activity activity) {
        super(activity);
        this.N = uw0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(vz0 vz0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(18, context, c6Var, false, false);
        this.N = vz0Var;
    }
}
