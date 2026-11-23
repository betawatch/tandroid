package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.messenger.y10 e;
    public final /* synthetic */ long f;

    public /* synthetic */ n1(int i7, long j3, long j10, org.telegram.messenger.y10 y10Var, long j11, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = j3;
        this.d = j10;
        this.e = y10Var;
        this.f = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = this.b;
                long j3 = di.y8.y(i7, false).p().amount;
                long j10 = this.c;
                org.telegram.messenger.y10 y10Var = this.e;
                long j11 = this.f;
                if (j3 >= j10) {
                    y10Var.a(Long.valueOf(j11));
                    break;
                } else {
                    Activity u02 = org.telegram.messenger.g0.u0();
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    org.telegram.ui.ActionBar.h6 bVar = (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) ? new fi.b() : T != null ? T.getResourceProvider() : null;
                    if (u02 != null) {
                        long j12 = this.d;
                        new di.fb(u02, bVar, j10, 13, org.telegram.messenger.n5.s(i7, j12), new org.telegram.ui.a6(1, j11, y10Var), j12).show();
                        break;
                    }
                }
                break;
            default:
                int i10 = this.b;
                n1 n1Var = new n1(i10, this.c, this.d, this.e, this.f, 0);
                if (!di.y8.y(i10, false).e) {
                    di.y8 y10 = di.y8.y(i10, false);
                    y10.e = false;
                    y10.q(n1Var, false, true);
                    y10.e = true;
                    break;
                } else {
                    n1Var.run();
                    break;
                }
        }
    }
}
