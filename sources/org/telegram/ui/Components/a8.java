package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class a8 extends d8 {
    public final /* synthetic */ Context E;
    public final /* synthetic */ j8 F;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a8(j8 j8Var, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.F = j8Var;
        this.E = context2;
    }

    @Override // org.telegram.ui.Components.d8
    public final TextView a() {
        switch (this.y) {
            case 0:
                fa0 fa0Var = new fa0(this.E);
                fa0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.i6.Oi));
                fa0Var.setTextSize(1, 17.0f);
                fa0Var.setTypeface(AndroidUtilities.bold());
                fa0Var.setEllipsize(TextUtils.TruncateAt.END);
                fa0Var.setSingleLine(true);
                return fa0Var;
            default:
                fa0 fa0Var2 = new fa0(this.E);
                int i10 = org.telegram.ui.ActionBar.i6.Si;
                j8 j8Var = this.F;
                fa0Var2.setTextColor(j8Var.getThemedColor(i10));
                fa0Var2.setTextSize(1, 13.0f);
                fa0Var2.setEllipsize(TextUtils.TruncateAt.END);
                fa0Var2.setSingleLine(true);
                fa0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                fa0Var2.setBackground(org.telegram.ui.ActionBar.i6.Y(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                fa0Var2.setOnClickListener(new org.telegram.ui.qf(18, this, fa0Var2));
                return fa0Var2;
        }
    }
}
