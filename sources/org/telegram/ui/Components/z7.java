package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                z90 z90Var = new z90(this.E);
                z90Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                z90Var.setTextSize(1, 17.0f);
                z90Var.setTypeface(AndroidUtilities.bold());
                z90Var.setEllipsize(TextUtils.TruncateAt.END);
                z90Var.setSingleLine(true);
                return z90Var;
            default:
                z90 z90Var2 = new z90(this.E);
                int i10 = org.telegram.ui.ActionBar.j6.Si;
                i8 i8Var = this.F;
                z90Var2.setTextColor(i8Var.getThemedColor(i10));
                z90Var2.setTextSize(1, 13.0f);
                z90Var2.setEllipsize(TextUtils.TruncateAt.END);
                z90Var2.setSingleLine(true);
                z90Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                z90Var2.setBackground(org.telegram.ui.ActionBar.j6.Y(i8Var.getThemedColor(org.telegram.ui.ActionBar.j6.i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                z90Var2.setOnClickListener(new org.telegram.ui.sf(18, this, z90Var2));
                return z90Var2;
        }
    }
}
