package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class d8 extends g8 {
    public final /* synthetic */ Context E;
    public final /* synthetic */ m8 F;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8(m8 m8Var, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.F = m8Var;
        this.E = context2;
    }

    @Override // org.telegram.ui.Components.g8
    public final TextView a() {
        switch (this.y) {
            case 0:
                sa0 sa0Var = new sa0(this.E);
                sa0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.g6.Oi));
                sa0Var.setTextSize(1, 17.0f);
                sa0Var.setTypeface(AndroidUtilities.bold());
                sa0Var.setEllipsize(TextUtils.TruncateAt.END);
                sa0Var.setSingleLine(true);
                return sa0Var;
            default:
                sa0 sa0Var2 = new sa0(this.E);
                int i10 = org.telegram.ui.ActionBar.g6.Si;
                m8 m8Var = this.F;
                sa0Var2.setTextColor(m8Var.getThemedColor(i10));
                sa0Var2.setTextSize(1, 13.0f);
                sa0Var2.setEllipsize(TextUtils.TruncateAt.END);
                sa0Var2.setSingleLine(true);
                sa0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                sa0Var2.setBackground(org.telegram.ui.ActionBar.g6.Z(m8Var.getThemedColor(org.telegram.ui.ActionBar.g6.i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                sa0Var2.setOnClickListener(new org.telegram.ui.xf(18, this, sa0Var2));
                return sa0Var2;
        }
    }
}
