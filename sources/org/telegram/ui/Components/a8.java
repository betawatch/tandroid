package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                ea0 ea0Var = new ea0(this.E);
                ea0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.h6.Oi));
                ea0Var.setTextSize(1, 17.0f);
                ea0Var.setTypeface(AndroidUtilities.bold());
                ea0Var.setEllipsize(TextUtils.TruncateAt.END);
                ea0Var.setSingleLine(true);
                return ea0Var;
            default:
                ea0 ea0Var2 = new ea0(this.E);
                int i10 = org.telegram.ui.ActionBar.h6.Si;
                j8 j8Var = this.F;
                ea0Var2.setTextColor(j8Var.getThemedColor(i10));
                ea0Var2.setTextSize(1, 13.0f);
                ea0Var2.setEllipsize(TextUtils.TruncateAt.END);
                ea0Var2.setSingleLine(true);
                ea0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                ea0Var2.setBackground(org.telegram.ui.ActionBar.h6.Y(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                ea0Var2.setOnClickListener(new org.telegram.ui.pf(18, this, ea0Var2));
                return ea0Var2;
        }
    }
}
