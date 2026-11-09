package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class du implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ du(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Context context = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.l6.K(context, false);
                break;
            case 1:
                Activity W = org.telegram.messenger.g0.W(context);
                if (W == null) {
                    W = LaunchActivity.G1;
                }
                if (W != null && !W.isFinishing()) {
                    W.moveTaskToBack(true);
                    break;
                }
                break;
            case 2:
                vf.c.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                vf.c.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                vf.c.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                vf.c.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                vf.c.t(context, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                vf.c.t(context, "https://promote.telegram.org/guidelines");
                break;
            default:
                vf.c.t(context, org.telegram.messenger.id.M0(2131742943, null));
                break;
        }
    }
}
