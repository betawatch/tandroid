package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class d81 implements View.OnClickListener {
    public final /* synthetic */ Context a;

    public d81(Activity activity) {
        this.a = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        pf.d.r(this.a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
