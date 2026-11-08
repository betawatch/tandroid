package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ r10(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Context context = this.b;
        switch (i7) {
            case 0:
                p10.k(context);
                break;
            case 1:
                vf.c.t(context, org.telegram.messenger.id.M0(2131744969, null));
                break;
            case 2:
                Activity W = org.telegram.messenger.g0.W(context);
                if (W instanceof LaunchActivity) {
                    ((LaunchActivity) W).t0(new PremiumPreviewFragment(0, ug.i0.u1(10)));
                    break;
                }
                break;
            default:
                Activity W2 = org.telegram.messenger.g0.W(context);
                if (W2 instanceof LaunchActivity) {
                    ((LaunchActivity) W2).t0(new PremiumPreviewFragment(0, ug.i0.u1(9)));
                    break;
                }
                break;
        }
    }
}
