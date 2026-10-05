package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class c91 implements View.OnClickListener {
    public final /* synthetic */ Context a;

    public c91(Activity activity) {
        this.a = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nf.f.s(this.a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
