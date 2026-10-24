package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Utilities.Callback e;
    public final /* synthetic */ long f;

    public /* synthetic */ u2(int i10, long j10, long j11, Utilities.Callback callback, long j12, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.e = callback;
        this.f = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.b;
                u2 u2Var = new u2(i10, this.c, this.d, this.e, this.f, 1);
                if (!ai.ha.y(i10, false).e) {
                    ai.ha y3 = ai.ha.y(i10, false);
                    y3.e = false;
                    y3.q(false, true, u2Var);
                    y3.e = true;
                    break;
                } else {
                    u2Var.run();
                    break;
                }
            default:
                int i11 = this.b;
                long j10 = ai.ha.y(i11, false).p().amount;
                long j11 = this.c;
                Utilities.Callback callback = this.e;
                long j12 = this.f;
                if (j10 >= j11) {
                    callback.run(Long.valueOf(j12));
                    break;
                } else {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    org.telegram.ui.ActionBar.g6 bVar = (PhotoViewer.u1().T1() || (U != null && U.hasShownSheet())) ? new ci.b() : U != null ? U.getResourceProvider() : null;
                    if (activity != null) {
                        long j13 = this.d;
                        new ai.dd(activity, bVar, j11, 13, DialogObject.getShortName(i11, j13), new org.telegram.ui.j6(j12, 1, callback), j13).show();
                        break;
                    }
                }
                break;
        }
    }
}
