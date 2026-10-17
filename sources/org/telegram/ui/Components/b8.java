package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class b8 extends e8 {
    public final /* synthetic */ Context E;
    public final /* synthetic */ k8 F;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8(k8 k8Var, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.F = k8Var;
        this.E = context2;
    }

    @Override // org.telegram.ui.Components.e8
    public final TextView a() {
        switch (this.y) {
            case 0:
                ma0 ma0Var = new ma0(this.E);
                ma0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.h6.Oi));
                ma0Var.setTextSize(1, 17.0f);
                ma0Var.setTypeface(AndroidUtilities.bold());
                ma0Var.setEllipsize(TextUtils.TruncateAt.END);
                ma0Var.setSingleLine(true);
                return ma0Var;
            default:
                ma0 ma0Var2 = new ma0(this.E);
                int i10 = org.telegram.ui.ActionBar.h6.Si;
                k8 k8Var = this.F;
                ma0Var2.setTextColor(k8Var.getThemedColor(i10));
                ma0Var2.setTextSize(1, 13.0f);
                ma0Var2.setEllipsize(TextUtils.TruncateAt.END);
                ma0Var2.setSingleLine(true);
                ma0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                ma0Var2.setBackground(org.telegram.ui.ActionBar.h6.Z(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                ma0Var2.setOnClickListener(new org.telegram.ui.ActionBar.s1(28, this, ma0Var2));
                return ma0Var2;
        }
    }
}
