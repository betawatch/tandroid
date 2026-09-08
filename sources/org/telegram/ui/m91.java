package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class m91 implements View.OnClickListener {
    public final /* synthetic */ Context a;

    public m91(Activity activity) {
        this.a = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        of.f.s(this.a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
