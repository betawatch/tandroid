package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gs extends org.telegram.ui.Cells.p8 {
    public final /* synthetic */ int M = 0;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs(is isVar, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.N = isVar;
    }

    @Override // org.telegram.ui.Cells.p8
    public int c(int i9) {
        switch (this.M) {
            case 2:
                ((vz0) this.N).e.getClass();
                break;
        }
        return i9;
    }

    @Override // org.telegram.ui.Cells.p8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.M) {
            case 0:
                super.onLayout(z10, i9, i10, i11, i12);
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                is isVar = (is) this.N;
                int measuredHeight2 = (measuredHeight - isVar.Q.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.o9 o9Var = isVar.Q;
                o9Var.layout(dp, measuredHeight2, o9Var.getMeasuredWidth() + dp, isVar.Q.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z10, i9, i10, i11, i12);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                uw0 uw0Var = (uw0) this.N;
                int measuredHeight4 = (measuredHeight3 - uw0Var.d.r0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.o9 o9Var2 = uw0Var.d.r0;
                o9Var2.layout(dp2, measuredHeight4, o9Var2.getMeasuredWidth() + dp2, uw0Var.d.r0.getMeasuredHeight() + measuredHeight4);
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.p8, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.M) {
            case 0:
                super.onMeasure(i9, i10);
                is isVar = (is) this.N;
                isVar.Q.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                isVar.Q.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            case 1:
                super.onMeasure(i9, i10);
                uw0 uw0Var = (uw0) this.N;
                uw0Var.d.r0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                uw0Var.d.r0.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs(uw0 uw0Var, Activity activity) {
        super(activity);
        this.N = uw0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs(vz0 vz0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(18, context, b6Var, false, false);
        this.N = vz0Var;
    }
}
