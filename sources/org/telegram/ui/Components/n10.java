package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ n10(Context context, int i3) {
        this.a = i3;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Context context = this.b;
        switch (i3) {
            case 0:
                l10.j(context);
                break;
            case 1:
                sf.c.t(context, org.telegram.messenger.bd.M0(2131744976, null));
                break;
            case 2:
                Activity W = org.telegram.messenger.g0.W(context);
                if (W instanceof LaunchActivity) {
                    ((LaunchActivity) W).t0(new PremiumPreviewFragment(0, vg.i0.u1(10)));
                    break;
                }
                break;
            default:
                Activity W2 = org.telegram.messenger.g0.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, vg.i0.u1(9)));
                    break;
                }
                break;
        }
    }
}
