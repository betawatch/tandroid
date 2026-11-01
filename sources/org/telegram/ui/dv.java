package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ dv(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Context context = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.t6.K(context, false);
                break;
            case 1:
                Activity W = org.telegram.messenger.i0.W(context);
                if (W == null) {
                    W = LaunchActivity.I1;
                }
                if (W != null && !W.isFinishing()) {
                    W.moveTaskToBack(true);
                    break;
                }
                break;
            case 2:
                gf.f.r(context, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                gf.f.r(context, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                gf.f.r(context, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                gf.f.r(context, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                gf.f.r(context, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                gf.f.r(context, "https://promote.telegram.org/guidelines");
                break;
            default:
                gf.f.r(context, org.telegram.messenger.dd.L0(2131742969, null));
                break;
        }
    }
}
