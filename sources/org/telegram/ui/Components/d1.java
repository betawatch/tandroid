package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.messenger.u10 e;
    public final /* synthetic */ long f;

    public /* synthetic */ d1(int i3, long j10, long j11, org.telegram.messenger.u10 u10Var, long j12, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = j10;
        this.d = j11;
        this.e = u10Var;
        this.f = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i3 = this.b;
                long j10 = ci.e9.y(i3, false).p().amount;
                long j11 = this.c;
                org.telegram.messenger.u10 u10Var = this.e;
                long j12 = this.f;
                if (j10 >= j11) {
                    u10Var.a(Long.valueOf(j12));
                    break;
                } else {
                    Activity u02 = org.telegram.messenger.g0.u0();
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    org.telegram.ui.ActionBar.e6 bVar = (PhotoViewer.v1().U1() || (T != null && T.hasShownSheet())) ? new ei.b() : T != null ? T.getResourceProvider() : null;
                    if (u02 != null) {
                        long j13 = this.d;
                        new ci.mb(u02, bVar, j11, 13, org.telegram.messenger.m5.s(i3, j13), new org.telegram.ui.c6(1, j12, u10Var), j13).show();
                        break;
                    }
                }
                break;
            default:
                int i10 = this.b;
                d1 d1Var = new d1(i10, this.c, this.d, this.e, this.f, 0);
                if (!ci.e9.y(i10, false).e) {
                    ci.e9 y9 = ci.e9.y(i10, false);
                    y9.e = false;
                    y9.q(d1Var, false, true);
                    y9.e = true;
                    break;
                } else {
                    d1Var.run();
                    break;
                }
        }
    }
}
