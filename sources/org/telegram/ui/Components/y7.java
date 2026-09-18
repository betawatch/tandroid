package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class y7 extends b8 {
    public final /* synthetic */ Context E;
    public final /* synthetic */ h8 F;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y7(h8 h8Var, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.F = h8Var;
        this.E = context2;
    }

    @Override // org.telegram.ui.Components.b8
    public final TextView a() {
        switch (this.y) {
            case 0:
                r90 r90Var = new r90(this.E);
                r90Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                r90Var.setTextSize(1, 17.0f);
                r90Var.setTypeface(AndroidUtilities.bold());
                r90Var.setEllipsize(TextUtils.TruncateAt.END);
                r90Var.setSingleLine(true);
                return r90Var;
            default:
                r90 r90Var2 = new r90(this.E);
                int i10 = org.telegram.ui.ActionBar.j6.Si;
                h8 h8Var = this.F;
                r90Var2.setTextColor(h8Var.getThemedColor(i10));
                r90Var2.setTextSize(1, 13.0f);
                r90Var2.setEllipsize(TextUtils.TruncateAt.END);
                r90Var2.setSingleLine(true);
                r90Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                r90Var2.setBackground(org.telegram.ui.ActionBar.j6.Y(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                r90Var2.setOnClickListener(new org.telegram.ui.tf(18, this, r90Var2));
                return r90Var2;
        }
    }
}
