package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ms extends org.telegram.ui.Cells.o8 {
    public final /* synthetic */ int N = 1;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms(os osVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.O = osVar;
    }

    @Override // org.telegram.ui.Cells.o8
    public int c(int i10) {
        switch (this.N) {
            case 2:
                ((n01) this.O).e.getClass();
                break;
        }
        return i10;
    }

    @Override // org.telegram.ui.Cells.o8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.N) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                os osVar = (os) this.O;
                int measuredHeight2 = (measuredHeight - osVar.R.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.p9 p9Var = osVar.R;
                p9Var.layout(dp, measuredHeight2, p9Var.getMeasuredWidth() + dp, osVar.R.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                lx0 lx0Var = (lx0) this.O;
                int measuredHeight4 = (measuredHeight3 - lx0Var.d.s0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.p9 p9Var2 = lx0Var.d.s0;
                p9Var2.layout(dp2, measuredHeight4, p9Var2.getMeasuredWidth() + dp2, lx0Var.d.s0.getMeasuredHeight() + measuredHeight4);
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.o8, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.N) {
            case 0:
                super.onMeasure(i10, i11);
                os osVar = (os) this.O;
                osVar.R.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                osVar.R.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            case 1:
                super.onMeasure(i10, i11);
                lx0 lx0Var = (lx0) this.O;
                lx0Var.d.s0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                lx0Var.d.s0.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms(lx0 lx0Var, Activity activity) {
        super(activity);
        this.O = lx0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms(n01 n01Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(18, context, g6Var, false, false);
        this.O = n01Var;
    }
}
