package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Utilities.Callback e;
    public final /* synthetic */ long f;

    public /* synthetic */ x2(int i10, long j10, long j11, Utilities.Callback callback, long j12, int i11) {
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
                x2 x2Var = new x2(i10, this.c, this.d, this.e, this.f, 1);
                if (!bi.ca.y(i10, false).e) {
                    bi.ca y3 = bi.ca.y(i10, false);
                    y3.e = false;
                    y3.q(false, true, x2Var);
                    y3.e = true;
                    break;
                } else {
                    x2Var.run();
                    break;
                }
            default:
                int i11 = this.b;
                long j10 = bi.ca.y(i11, false).p().amount;
                long j11 = this.c;
                Utilities.Callback callback = this.e;
                long j12 = this.f;
                if (j10 >= j11) {
                    callback.run(Long.valueOf(j12));
                    break;
                } else {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    org.telegram.ui.ActionBar.u6 bVar = (PhotoViewer.v1().U1() || (U != null && U.hasShownSheet())) ? new di.b() : U != null ? U.getResourceProvider() : null;
                    if (activity != null) {
                        long j13 = this.d;
                        new bi.tc(activity, bVar, j11, 13, DialogObject.getShortName(i11, j13), new org.telegram.ui.f6(j12, 1, callback), j13).show();
                        break;
                    }
                }
                break;
        }
    }
}
