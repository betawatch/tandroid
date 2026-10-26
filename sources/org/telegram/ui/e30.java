package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e30 extends org.telegram.ui.Components.g8 {
    public final /* synthetic */ v50 E;
    public final /* synthetic */ Activity y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e30(v50 v50Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = v50Var;
        this.y = activity;
    }

    @Override // org.telegram.ui.Components.g8
    public final TextView a() {
        TextView textView = new TextView(this.y);
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.hg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.k51(20, this, textView));
        return textView;
    }
}
