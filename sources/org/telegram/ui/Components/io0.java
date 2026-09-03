package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class io0 extends w7 {
    public final /* synthetic */ Context B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ io0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.C = obj;
        this.B = context2;
    }

    @Override // org.telegram.ui.Components.w7
    public final TextView a() {
        switch (this.y) {
            case 0:
                v90 v90Var = new v90(this.B);
                v90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Si, ((ko0) this.C).J));
                v90Var.setTextSize(1, 12.0f);
                v90Var.setEllipsize(TextUtils.TruncateAt.END);
                v90Var.setSingleLine(true);
                v90Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return v90Var;
            default:
                TextView textView = new TextView(this.B);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Pi, ((ProfileActivity) this.C).w0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
