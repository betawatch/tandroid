package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q10 extends org.telegram.ui.Components.t7 {
    public final /* synthetic */ Activity E;
    public final /* synthetic */ c40 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q10(c40 c40Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.F = c40Var;
        this.E = activity;
    }

    @Override // org.telegram.ui.Components.t7
    public final TextView a() {
        TextView textView = new TextView(this.E);
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.Yg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.vv0(24, this, textView));
        return textView;
    }
}
