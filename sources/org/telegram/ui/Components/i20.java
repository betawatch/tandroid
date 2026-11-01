package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ i20(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Context context = this.b;
        switch (i10) {
            case 0:
                g20.j(context);
                break;
            case 1:
                gf.f.r(context, org.telegram.messenger.dd.L0(2131744984, null));
                break;
            case 2:
                Activity W = org.telegram.messenger.i0.W(context);
                if (W instanceof LaunchActivity) {
                    ((LaunchActivity) W).t0(new PremiumPreviewFragment(0, kg.q0.u1(10)));
                    break;
                }
                break;
            default:
                Activity W2 = org.telegram.messenger.i0.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, kg.q0.u1(9)));
                    break;
                }
                break;
        }
    }
}
