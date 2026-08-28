package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Utilities.Callback e;
    public final /* synthetic */ long f;

    public /* synthetic */ q2(int i9, long j10, long j11, Utilities.Callback callback, long j12, int i10) {
        this.a = i10;
        this.b = i9;
        this.c = j10;
        this.d = j11;
        this.e = callback;
        this.f = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i9 = this.b;
                q2 q2Var = new q2(i9, this.c, this.d, this.e, this.f, 1);
                if (!gh.v7.y(i9, false).e) {
                    gh.v7 y10 = gh.v7.y(i9, false);
                    y10.e = false;
                    y10.q(false, true, q2Var);
                    y10.e = true;
                    break;
                } else {
                    q2Var.run();
                    break;
                }
            default:
                int i10 = this.b;
                long j10 = gh.v7.y(i10, false).p().amount;
                long j11 = this.c;
                Utilities.Callback callback = this.e;
                long j12 = this.f;
                if (j10 >= j11) {
                    callback.run(Long.valueOf(j12));
                    break;
                } else {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    org.telegram.ui.ActionBar.b6 bVar = (PhotoViewer.t1().Q1() || (U != null && U.hasShownSheet())) ? new ih.b() : U != null ? U.getResourceProvider() : null;
                    if (activity != null) {
                        long j13 = this.d;
                        new gh.ea(activity, bVar, j11, 13, DialogObject.getShortName(i10, j13), new org.telegram.ui.e6(j12, 1, callback), j13).show();
                        break;
                    }
                }
                break;
        }
    }
}
