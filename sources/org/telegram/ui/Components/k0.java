package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ k0(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                Context context = this.b;
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                Context context2 = this.b;
                if (context2 != null) {
                    try {
                        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context2.getPackageName()));
                        Activity W = org.telegram.messenger.i0.W(context2);
                        if (W instanceof LaunchActivity) {
                            W.startActivityForResult(intent, org.telegram.messenger.zs.q1);
                        } else {
                            context2.startActivity(intent);
                        }
                        break;
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                        return;
                    }
                }
                break;
            case 2:
                gf.f.r(this.b, org.telegram.messenger.v2.g);
                break;
            default:
                Context context3 = this.b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                    context3.startActivity(intent2);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                }
        }
    }
}
