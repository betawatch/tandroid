package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ls extends org.telegram.ui.Cells.o8 {
    public final /* synthetic */ int N = 1;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(ns nsVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.O = nsVar;
    }

    @Override // org.telegram.ui.Cells.o8
    public int c(int i10) {
        switch (this.N) {
            case 2:
                ((g01) this.O).e.getClass();
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
                ns nsVar = (ns) this.O;
                int measuredHeight2 = (measuredHeight - nsVar.R.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.p9 p9Var = nsVar.R;
                p9Var.layout(dp, measuredHeight2, p9Var.getMeasuredWidth() + dp, nsVar.R.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                ex0 ex0Var = (ex0) this.O;
                int measuredHeight4 = (measuredHeight3 - ex0Var.d.s0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.p9 p9Var2 = ex0Var.d.s0;
                p9Var2.layout(dp2, measuredHeight4, p9Var2.getMeasuredWidth() + dp2, ex0Var.d.s0.getMeasuredHeight() + measuredHeight4);
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
                ns nsVar = (ns) this.O;
                nsVar.R.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                nsVar.R.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            case 1:
                super.onMeasure(i10, i11);
                ex0 ex0Var = (ex0) this.O;
                ex0Var.d.s0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                ex0Var.d.s0.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(ex0 ex0Var, Activity activity) {
        super(activity);
        this.O = ex0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(g01 g01Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(18, context, f6Var, false, false);
        this.O = g01Var;
    }
}
