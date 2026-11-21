package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                vf.c.t(context, org.telegram.messenger.gd.N0(2131742679, null));
                break;
        }
    }
}
