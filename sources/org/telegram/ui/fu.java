package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ fu(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Context context = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.m6.K(context, false);
                break;
            case 1:
                Activity W = org.telegram.messenger.g0.W(context);
                if (W == null) {
                    W = LaunchActivity.H1;
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
                vf.c.t(context, org.telegram.messenger.hd.N0(2131742677, null));
                break;
        }
    }
}
