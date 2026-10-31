package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j41 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ j41(SessionsActivity sessionsActivity, int i10) {
        this.a = i10;
        this.b = sessionsActivity;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                SessionsActivity sessionsActivity = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                SessionsActivity.a0(this.b);
                break;
        }
    }
}
