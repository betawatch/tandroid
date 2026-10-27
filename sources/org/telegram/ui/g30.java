package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class g30 extends org.telegram.ui.Components.g8 {
    public final /* synthetic */ x50 E;
    public final /* synthetic */ Activity y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g30(x50 x50Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = x50Var;
        this.y = activity;
    }

    @Override // org.telegram.ui.Components.g8
    public final TextView a() {
        TextView textView = new TextView(this.y);
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.hg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.l51(20, this, textView));
        return textView;
    }
}
