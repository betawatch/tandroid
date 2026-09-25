package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class n30 extends org.telegram.ui.Components.d8 {
    public final /* synthetic */ d60 E;
    public final /* synthetic */ Activity y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n30(d60 d60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = d60Var;
        this.y = activity;
    }

    @Override // org.telegram.ui.Components.d8
    public final TextView a() {
        TextView textView = new TextView(this.y);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new ov(9, this, textView));
        return textView;
    }
}
