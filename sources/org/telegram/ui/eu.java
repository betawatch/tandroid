package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class eu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ eu(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Context context = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.n6.K(context, false);
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
                vf.c.t(context, org.telegram.messenger.gd.N0(2131742672, null));
                break;
        }
    }
}
