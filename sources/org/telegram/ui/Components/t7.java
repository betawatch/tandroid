package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                t90 t90Var = new t90(this.B);
                t90Var.setTextColor(this.C.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                t90Var.setTextSize(1, 17.0f);
                t90Var.setTypeface(AndroidUtilities.bold());
                t90Var.setEllipsize(TextUtils.TruncateAt.END);
                t90Var.setSingleLine(true);
                return t90Var;
            default:
                t90 t90Var2 = new t90(this.B);
                int i10 = org.telegram.ui.ActionBar.j6.Si;
                c8 c8Var = this.C;
                t90Var2.setTextColor(c8Var.getThemedColor(i10));
                t90Var2.setTextSize(1, 13.0f);
                t90Var2.setEllipsize(TextUtils.TruncateAt.END);
                t90Var2.setSingleLine(true);
                t90Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                t90Var2.setBackground(org.telegram.ui.ActionBar.j6.Y(c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                t90Var2.setOnClickListener(new w2(3, this, t90Var2));
                return t90Var2;
        }
    }
}
