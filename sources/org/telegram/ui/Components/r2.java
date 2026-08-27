package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Utilities.Callback e;
    public final /* synthetic */ long f;

    public /* synthetic */ r2(int i10, long j10, long j11, Utilities.Callback callback, long j12, int i11) {
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
                r2 r2Var = new r2(i10, this.c, this.d, this.e, this.f, 1);
                if (!hh.u7.y(i10, false).e) {
                    hh.u7 y10 = hh.u7.y(i10, false);
                    y10.e = false;
                    y10.q(false, true, r2Var);
                    y10.e = true;
                    break;
                } else {
                    r2Var.run();
                    break;
                }
            default:
                int i11 = this.b;
                long j10 = hh.u7.y(i11, false).p().amount;
                long j11 = this.c;
                Utilities.Callback callback = this.e;
                long j12 = this.f;
                if (j10 >= j11) {
                    callback.run(Long.valueOf(j12));
                    break;
                } else {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    org.telegram.ui.ActionBar.c6 bVar = (PhotoViewer.t1().Q1() || (U != null && U.hasShownSheet())) ? new jh.b() : U != null ? U.getResourceProvider() : null;
                    if (activity != null) {
                        long j13 = this.d;
                        new hh.ea(activity, bVar, j11, 13, DialogObject.getShortName(i11, j13), new org.telegram.ui.f6(j12, 1, callback), j13).show();
                        break;
                    }
                }
                break;
        }
    }
}
