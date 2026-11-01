package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.messenger.r20 e;
    public final /* synthetic */ long f;

    public /* synthetic */ e1(int i10, long j10, long j11, org.telegram.messenger.r20 r20Var, long j12, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.e = r20Var;
        this.f = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.b;
                long j10 = rh.e6.y(i10, false).p().amount;
                long j11 = this.c;
                org.telegram.messenger.r20 r20Var = this.e;
                long j12 = this.f;
                if (j10 >= j11) {
                    r20Var.a(Long.valueOf(j12));
                    break;
                } else {
                    Activity u02 = org.telegram.messenger.i0.u0();
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    org.telegram.ui.ActionBar.p6 bVar = (PhotoViewer.v1().U1() || (T != null && T.hasShownSheet())) ? new th.b() : T != null ? T.getResourceProvider() : null;
                    if (u02 != null) {
                        long j13 = this.d;
                        new rh.x7(u02, bVar, j11, 13, org.telegram.messenger.o5.s(i10, j13), new org.telegram.ui.a6(1, j12, r20Var), j13).show();
                        break;
                    }
                }
                break;
            default:
                int i11 = this.b;
                e1 e1Var = new e1(i11, this.c, this.d, this.e, this.f, 0);
                if (!rh.e6.y(i11, false).e) {
                    rh.e6 y3 = rh.e6.y(i11, false);
                    y3.e = false;
                    y3.q(e1Var, false, true);
                    y3.e = true;
                    break;
                } else {
                    e1Var.run();
                    break;
                }
        }
    }
}
