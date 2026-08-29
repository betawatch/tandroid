package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fs extends org.telegram.ui.Cells.m8 {
    public final /* synthetic */ int M = 0;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(hs hsVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.N = hsVar;
    }

    @Override // org.telegram.ui.Cells.m8
    public int c(int i10) {
        switch (this.M) {
            case 2:
                ((vz0) this.N).e.getClass();
                break;
        }
        return i10;
    }

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.M) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                hs hsVar = (hs) this.N;
                int measuredHeight2 = (measuredHeight - hsVar.Q.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.t9 t9Var = hsVar.Q;
                t9Var.layout(dp, measuredHeight2, t9Var.getMeasuredWidth() + dp, hsVar.Q.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                tw0 tw0Var = (tw0) this.N;
                int measuredHeight4 = (measuredHeight3 - tw0Var.d.r0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.t9 t9Var2 = tw0Var.d.r0;
                t9Var2.layout(dp2, measuredHeight4, t9Var2.getMeasuredWidth() + dp2, tw0Var.d.r0.getMeasuredHeight() + measuredHeight4);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.M) {
            case 0:
                super.onMeasure(i10, i11);
                hs hsVar = (hs) this.N;
                hsVar.Q.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                hsVar.Q.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            case 1:
                super.onMeasure(i10, i11);
                tw0 tw0Var = (tw0) this.N;
                tw0Var.d.r0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                tw0Var.d.r0.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(tw0 tw0Var, Activity activity) {
        super(activity);
        this.N = tw0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(vz0 vz0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(18, context, c6Var, false, false);
        this.N = vz0Var;
    }
}
