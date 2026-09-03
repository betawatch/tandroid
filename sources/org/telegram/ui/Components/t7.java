package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                v90 v90Var = new v90(this.B);
                v90Var.setTextColor(this.C.getThemedColor(org.telegram.ui.ActionBar.k6.Oi));
                v90Var.setTextSize(1, 17.0f);
                v90Var.setTypeface(AndroidUtilities.bold());
                v90Var.setEllipsize(TextUtils.TruncateAt.END);
                v90Var.setSingleLine(true);
                return v90Var;
            default:
                v90 v90Var2 = new v90(this.B);
                int i10 = org.telegram.ui.ActionBar.k6.Si;
                c8 c8Var = this.C;
                v90Var2.setTextColor(c8Var.getThemedColor(i10));
                v90Var2.setTextSize(1, 13.0f);
                v90Var2.setEllipsize(TextUtils.TruncateAt.END);
                v90Var2.setSingleLine(true);
                v90Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                v90Var2.setBackground(org.telegram.ui.ActionBar.k6.Y(c8Var.getThemedColor(org.telegram.ui.ActionBar.k6.i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                v90Var2.setOnClickListener(new w2(3, this, v90Var2));
                return v90Var2;
        }
    }
}
