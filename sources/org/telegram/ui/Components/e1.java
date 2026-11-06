package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.messenger.c20 e;
    public final /* synthetic */ long f;

    public /* synthetic */ e1(int i7, long j3, long j10, org.telegram.messenger.c20 c20Var, long j11, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = j3;
        this.d = j10;
        this.e = c20Var;
        this.f = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = this.b;
                long j3 = bi.ea.y(i7, false).p().amount;
                long j10 = this.c;
                org.telegram.messenger.c20 c20Var = this.e;
                long j11 = this.f;
                if (j3 >= j10) {
                    c20Var.a(Long.valueOf(j11));
                    break;
                } else {
                    Activity u02 = org.telegram.messenger.g0.u0();
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    org.telegram.ui.ActionBar.f6 bVar = (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) ? new di.b() : T != null ? T.getResourceProvider() : null;
                    if (u02 != null) {
                        long j12 = this.d;
                        new bi.tc(u02, bVar, j10, 13, org.telegram.messenger.m5.s(i7, j12), new org.telegram.ui.a6(1, j11, c20Var), j12).show();
                        break;
                    }
                }
                break;
            default:
                int i10 = this.b;
                e1 e1Var = new e1(i10, this.c, this.d, this.e, this.f, 0);
                if (!bi.ea.y(i10, false).e) {
                    bi.ea y10 = bi.ea.y(i10, false);
                    y10.e = false;
                    y10.q(e1Var, false, true);
                    y10.e = true;
                    break;
                } else {
                    e1Var.run();
                    break;
                }
        }
    }
}
