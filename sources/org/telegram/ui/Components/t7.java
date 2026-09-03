package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t7 extends w7 {
    public final /* synthetic */ Context B;
    public final /* synthetic */ c8 C;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7(c8 c8Var, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.C = c8Var;
        this.B = context2;
    }

    @Override // org.telegram.ui.Components.w7
    public final TextView a() {
        switch (this.y) {
            case 0:
                u90 u90Var = new u90(this.B);
                u90Var.setTextColor(this.C.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                u90Var.setTextSize(1, 17.0f);
                u90Var.setTypeface(AndroidUtilities.bold());
                u90Var.setEllipsize(TextUtils.TruncateAt.END);
                u90Var.setSingleLine(true);
                return u90Var;
            default:
                u90 u90Var2 = new u90(this.B);
                int i10 = org.telegram.ui.ActionBar.j6.Si;
                c8 c8Var = this.C;
                u90Var2.setTextColor(c8Var.getThemedColor(i10));
                u90Var2.setTextSize(1, 13.0f);
                u90Var2.setEllipsize(TextUtils.TruncateAt.END);
                u90Var2.setSingleLine(true);
                u90Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                u90Var2.setBackground(org.telegram.ui.ActionBar.j6.Y(c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                u90Var2.setOnClickListener(new w2(3, this, u90Var2));
                return u90Var2;
        }
    }
}
