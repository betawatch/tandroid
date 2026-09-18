package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                aa0 aa0Var = new aa0(this.E);
                aa0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                aa0Var.setTextSize(1, 17.0f);
                aa0Var.setTypeface(AndroidUtilities.bold());
                aa0Var.setEllipsize(TextUtils.TruncateAt.END);
                aa0Var.setSingleLine(true);
                return aa0Var;
            default:
                aa0 aa0Var2 = new aa0(this.E);
                int i10 = org.telegram.ui.ActionBar.j6.Si;
                j8 j8Var = this.F;
                aa0Var2.setTextColor(j8Var.getThemedColor(i10));
                aa0Var2.setTextSize(1, 13.0f);
                aa0Var2.setEllipsize(TextUtils.TruncateAt.END);
                aa0Var2.setSingleLine(true);
                aa0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                aa0Var2.setBackground(org.telegram.ui.ActionBar.j6.Y(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                aa0Var2.setOnClickListener(new org.telegram.ui.sf(18, this, aa0Var2));
                return aa0Var2;
        }
    }
}
