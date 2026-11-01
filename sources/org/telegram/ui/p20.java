package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p20 extends org.telegram.ui.Components.r7 {
    public final /* synthetic */ Activity D;
    public final /* synthetic */ a50 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p20(a50 a50Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = a50Var;
        this.D = activity;
    }

    @Override // org.telegram.ui.Components.r7
    public final TextView a() {
        TextView textView = new TextView(this.D);
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.Vg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new vu(9, this, textView));
        return textView;
    }
}
