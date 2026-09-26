package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Utilities.Callback e;
    public final /* synthetic */ long f;

    public /* synthetic */ t2(int i10, long j3, long j10, Utilities.Callback callback, long j11, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = j3;
        this.d = j10;
        this.e = callback;
        this.f = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.b;
                t2 t2Var = new t2(i10, this.c, this.d, this.e, this.f, 1);
                if (!yh.s5.y(i10, false).e) {
                    yh.s5 y3 = yh.s5.y(i10, false);
                    y3.e = false;
                    y3.q(false, true, t2Var);
                    y3.e = true;
                    break;
                } else {
                    t2Var.run();
                    break;
                }
            default:
                int i11 = this.b;
                long j3 = yh.s5.y(i11, false).p().amount;
                long j10 = this.c;
                Utilities.Callback callback = this.e;
                long j11 = this.f;
                if (j3 >= j10) {
                    callback.run(Long.valueOf(j11));
                    break;
                } else {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    org.telegram.ui.ActionBar.d6 dVar = (PhotoViewer.t1().Q1() || (U != null && U.hasShownSheet())) ? new ai.d() : U != null ? U.getResourceProvider() : null;
                    if (activity != null) {
                        long j12 = this.d;
                        new yh.l7(activity, dVar, j10, 13, DialogObject.getShortName(i11, j12), new org.telegram.ui.f6(j11, 1, callback), j12).show();
                        break;
                    }
                }
                break;
        }
    }
}
