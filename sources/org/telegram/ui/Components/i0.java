package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ i0(Context context, int i3) {
        this.a = i3;
        this.b = context;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
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
                Context context2 = this.b;
                if (context2 != null) {
                    try {
                        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context2.getPackageName()));
                        Activity W = org.telegram.messenger.g0.W(context2);
                        if (W instanceof LaunchActivity) {
                            W.startActivityForResult(intent, org.telegram.messenger.hs.q1);
                        } else {
                            context2.startActivity(intent);
                        }
                        break;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                }
                break;
            case 2:
                sf.c.t(this.b, org.telegram.messenger.r2.g);
                break;
            default:
                Context context3 = this.b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    context3.startActivity(intent2);
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
        }
    }
}
