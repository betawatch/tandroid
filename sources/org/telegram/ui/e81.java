package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e81 implements View.OnClickListener {
    public final /* synthetic */ Context a;

    public e81(Activity activity) {
        this.a = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ve.e.s(this.a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
