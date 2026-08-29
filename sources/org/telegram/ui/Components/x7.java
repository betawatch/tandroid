package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class x7 extends a8 {
    public final /* synthetic */ Context A;
    public final /* synthetic */ g8 B;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x7(g8 g8Var, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.B = g8Var;
        this.A = context2;
    }

    @Override // org.telegram.ui.Components.a8
    public final TextView a() {
        switch (this.y) {
            case 0:
                n90 n90Var = new n90(this.A);
                n90Var.setTextColor(this.B.getThemedColor(org.telegram.ui.ActionBar.g6.Oi));
                n90Var.setTextSize(1, 17.0f);
                n90Var.setTypeface(AndroidUtilities.bold());
                n90Var.setEllipsize(TextUtils.TruncateAt.END);
                n90Var.setSingleLine(true);
                return n90Var;
            default:
                n90 n90Var2 = new n90(this.A);
                int i10 = org.telegram.ui.ActionBar.g6.Si;
                g8 g8Var = this.B;
                n90Var2.setTextColor(g8Var.getThemedColor(i10));
                n90Var2.setTextSize(1, 13.0f);
                n90Var2.setEllipsize(TextUtils.TruncateAt.END);
                n90Var2.setSingleLine(true);
                n90Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                n90Var2.setBackground(org.telegram.ui.ActionBar.g6.Y(g8Var.getThemedColor(org.telegram.ui.ActionBar.g6.i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                n90Var2.setOnClickListener(new t2(6, this, n90Var2));
                return n90Var2;
        }
    }
}
