package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                if (!jh.s7.y(i10, false).e) {
                    jh.s7 y8 = jh.s7.y(i10, false);
                    y8.e = false;
                    y8.q(false, true, u2Var);
                    y8.e = true;
                    break;
                } else {
                    u2Var.run();
                    break;
                }
            default:
                int i11 = this.b;
                long j10 = jh.s7.y(i11, false).p().amount;
                long j11 = this.c;
                Utilities.Callback callback = this.e;
                long j12 = this.f;
                if (j10 >= j11) {
                    callback.run(Long.valueOf(j12));
                    break;
                } else {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    org.telegram.ui.ActionBar.c6 bVar = (PhotoViewer.t1().Q1() || (U != null && U.hasShownSheet())) ? new lh.b() : U != null ? U.getResourceProvider() : null;
                    if (activity != null) {
                        long j13 = this.d;
                        new jh.y9(activity, bVar, j11, 13, DialogObject.getShortName(i11, j13), new org.telegram.ui.f6(j12, 1, callback), j13).show();
                        break;
                    }
                }
                break;
        }
    }
}
