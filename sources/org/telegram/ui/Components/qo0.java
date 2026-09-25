package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class qo0 extends d8 {
    public final /* synthetic */ Context E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qo0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override // org.telegram.ui.Components.d8
    public final TextView a() {
        switch (this.y) {
            case 0:
                ca0 ca0Var = new ca0(this.E);
                ca0Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Si, ((so0) this.F).M));
                ca0Var.setTextSize(1, 12.0f);
                ca0Var.setEllipsize(TextUtils.TruncateAt.END);
                ca0Var.setSingleLine(true);
                ca0Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return ca0Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Pi, ((ProfileActivity) this.F).z0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
