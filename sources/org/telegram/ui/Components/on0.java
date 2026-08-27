package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class on0 extends v7 {
    public final /* synthetic */ Context A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ on0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.B = obj;
        this.A = context2;
    }

    @Override // org.telegram.ui.Components.v7
    public final TextView a() {
        switch (this.y) {
            case 0:
                e90 e90Var = new e90(this.A);
                e90Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Si, ((qn0) this.B).I));
                e90Var.setTextSize(1, 12.0f);
                e90Var.setEllipsize(TextUtils.TruncateAt.END);
                e90Var.setSingleLine(true);
                e90Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return e90Var;
            default:
                TextView textView = new TextView(this.A);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Pi, ((ProfileActivity) this.B).v0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
