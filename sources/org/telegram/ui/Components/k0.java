package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ k0(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                Context context = this.b;
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                vf.c.t(this.b, org.telegram.messenger.r2.g);
                break;
            default:
                Context context2 = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    context2.startActivity(intent);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
        }
    }
}
