package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class z7 extends c8 {
    public final /* synthetic */ Context E;
    public final /* synthetic */ i8 F;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z7(i8 i8Var, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.F = i8Var;
        this.E = context2;
    }

    @Override // org.telegram.ui.Components.c8
    public final TextView a() {
        switch (this.y) {
            case 0:
                ca0 ca0Var = new ca0(this.E);
                ca0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                ca0Var.setTextSize(1, 17.0f);
                ca0Var.setTypeface(AndroidUtilities.bold());
                ca0Var.setEllipsize(TextUtils.TruncateAt.END);
                ca0Var.setSingleLine(true);
                return ca0Var;
            default:
                ca0 ca0Var2 = new ca0(this.E);
                int i10 = org.telegram.ui.ActionBar.j6.Si;
                i8 i8Var = this.F;
                ca0Var2.setTextColor(i8Var.getThemedColor(i10));
                ca0Var2.setTextSize(1, 13.0f);
                ca0Var2.setEllipsize(TextUtils.TruncateAt.END);
                ca0Var2.setSingleLine(true);
                ca0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                ca0Var2.setBackground(org.telegram.ui.ActionBar.j6.Y(i8Var.getThemedColor(org.telegram.ui.ActionBar.j6.i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                ca0Var2.setOnClickListener(new org.telegram.ui.sf(18, this, ca0Var2));
                return ca0Var2;
        }
    }
}
