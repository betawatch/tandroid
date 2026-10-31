package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q20 extends org.telegram.ui.Components.r7 {
    public final /* synthetic */ Activity D;
    public final /* synthetic */ b50 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q20(b50 b50Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = b50Var;
        this.D = activity;
    }

    @Override // org.telegram.ui.Components.r7
    public final TextView a() {
        TextView textView = new TextView(this.D);
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.Vg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new wu(9, this, textView));
        return textView;
    }
}
