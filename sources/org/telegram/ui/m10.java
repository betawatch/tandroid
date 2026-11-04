package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m10 extends org.telegram.ui.Components.u7 {
    public final /* synthetic */ Activity E;
    public final /* synthetic */ x30 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m10(x30 x30Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.F = x30Var;
        this.E = activity;
    }

    @Override // org.telegram.ui.Components.u7
    public final TextView a() {
        TextView textView = new TextView(this.E);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.Vg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.ux0(22, (Object) this, (Object) textView));
        return textView;
    }
}
