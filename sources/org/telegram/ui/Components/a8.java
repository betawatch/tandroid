package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                ba0 ba0Var = new ba0(this.E);
                ba0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                ba0Var.setTextSize(1, 17.0f);
                ba0Var.setTypeface(AndroidUtilities.bold());
                ba0Var.setEllipsize(TextUtils.TruncateAt.END);
                ba0Var.setSingleLine(true);
                return ba0Var;
            default:
                ba0 ba0Var2 = new ba0(this.E);
                int i10 = org.telegram.ui.ActionBar.j6.Si;
                j8 j8Var = this.F;
                ba0Var2.setTextColor(j8Var.getThemedColor(i10));
                ba0Var2.setTextSize(1, 13.0f);
                ba0Var2.setEllipsize(TextUtils.TruncateAt.END);
                ba0Var2.setSingleLine(true);
                ba0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                ba0Var2.setBackground(org.telegram.ui.ActionBar.j6.Y(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                ba0Var2.setOnClickListener(new org.telegram.ui.sh(15, this, ba0Var2));
                return ba0Var2;
        }
    }
}
