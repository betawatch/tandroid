package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class c8 extends f8 {
    public final /* synthetic */ Context E;
    public final /* synthetic */ l8 F;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c8(l8 l8Var, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.F = l8Var;
        this.E = context2;
    }

    @Override // org.telegram.ui.Components.f8
    public final TextView a() {
        switch (this.y) {
            case 0:
                ta0 ta0Var = new ta0(this.E);
                ta0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.i6.Oi));
                ta0Var.setTextSize(1, 17.0f);
                ta0Var.setTypeface(AndroidUtilities.bold());
                ta0Var.setEllipsize(TextUtils.TruncateAt.END);
                ta0Var.setSingleLine(true);
                return ta0Var;
            default:
                ta0 ta0Var2 = new ta0(this.E);
                int i10 = org.telegram.ui.ActionBar.i6.Si;
                l8 l8Var = this.F;
                ta0Var2.setTextColor(l8Var.getThemedColor(i10));
                ta0Var2.setTextSize(1, 13.0f);
                ta0Var2.setEllipsize(TextUtils.TruncateAt.END);
                ta0Var2.setSingleLine(true);
                ta0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                ta0Var2.setBackground(org.telegram.ui.ActionBar.i6.Z(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                ta0Var2.setOnClickListener(new org.telegram.ui.sf(18, this, ta0Var2));
                return ta0Var2;
        }
    }
}
