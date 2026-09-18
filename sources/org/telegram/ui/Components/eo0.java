package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class eo0 extends b8 {
    public final /* synthetic */ Context E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eo0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override // org.telegram.ui.Components.b8
    public final TextView a() {
        switch (this.y) {
            case 0:
                r90 r90Var = new r90(this.E);
                r90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Si, ((go0) this.F).M));
                r90Var.setTextSize(1, 12.0f);
                r90Var.setEllipsize(TextUtils.TruncateAt.END);
                r90Var.setSingleLine(true);
                r90Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return r90Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, ((ProfileActivity) this.F).z0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
