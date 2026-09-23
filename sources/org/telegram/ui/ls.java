package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ls extends org.telegram.ui.Cells.s8 {
    public final /* synthetic */ int Q = 0;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(ns nsVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.R = nsVar;
    }

    @Override // org.telegram.ui.Cells.s8
    public int c(int i10) {
        switch (this.Q) {
            case 2:
                ((s01) this.R).e.getClass();
                break;
        }
        return i10;
    }

    @Override // org.telegram.ui.Cells.s8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.Q) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                ns nsVar = (ns) this.R;
                int measuredHeight2 = (measuredHeight - nsVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.w9 w9Var = nsVar.U;
                w9Var.layout(dp, measuredHeight2, w9Var.getMeasuredWidth() + dp, nsVar.U.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                rx0 rx0Var = (rx0) this.R;
                int measuredHeight4 = (measuredHeight3 - rx0Var.d.v0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.w9 w9Var2 = rx0Var.d.v0;
                w9Var2.layout(dp2, measuredHeight4, w9Var2.getMeasuredWidth() + dp2, rx0Var.d.v0.getMeasuredHeight() + measuredHeight4);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.s8, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.Q) {
            case 0:
                super.onMeasure(i10, i11);
                ns nsVar = (ns) this.R;
                nsVar.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                nsVar.U.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            case 1:
                super.onMeasure(i10, i11);
                rx0 rx0Var = (rx0) this.R;
                rx0Var.d.v0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
                rx0Var.d.v0.setRoundRadius(AndroidUtilities.dp(30.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(rx0 rx0Var, Activity activity) {
        super(activity);
        this.R = rx0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(s01 s01Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(18, context, d6Var, false, false);
        this.R = s01Var;
    }
}
