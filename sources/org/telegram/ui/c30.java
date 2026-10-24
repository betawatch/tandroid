package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class c30 extends org.telegram.ui.Components.e8 {
    public final /* synthetic */ u50 E;
    public final /* synthetic */ Activity y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(u50 u50Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = u50Var;
        this.y = activity;
    }

    @Override // org.telegram.ui.Components.e8
    public final TextView a() {
        TextView textView = new TextView(this.y);
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.hg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.d51(20, this, textView));
        return textView;
    }
}
