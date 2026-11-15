package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.messenger.z10 e;
    public final /* synthetic */ long f;

    public /* synthetic */ b1(int i7, long j3, long j10, org.telegram.messenger.z10 z10Var, long j11, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = j3;
        this.d = j10;
        this.e = z10Var;
        this.f = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = this.b;
                long j3 = di.u8.y(i7, false).p().amount;
                long j10 = this.c;
                org.telegram.messenger.z10 z10Var = this.e;
                long j11 = this.f;
                if (j3 >= j10) {
                    z10Var.a(Long.valueOf(j11));
                    break;
                } else {
                    Activity u02 = org.telegram.messenger.g0.u0();
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    org.telegram.ui.ActionBar.e6 bVar = (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) ? new fi.b() : T != null ? T.getResourceProvider() : null;
                    if (u02 != null) {
                        long j12 = this.d;
                        new di.bb(u02, bVar, j10, 13, org.telegram.messenger.m5.s(i7, j12), new org.telegram.ui.b6(1, j11, z10Var), j12).show();
                        break;
                    }
                }
                break;
            default:
                int i10 = this.b;
                b1 b1Var = new b1(i10, this.c, this.d, this.e, this.f, 0);
                if (!di.u8.y(i10, false).e) {
                    di.u8 y10 = di.u8.y(i10, false);
                    y10.e = false;
                    y10.q(b1Var, false, true);
                    y10.e = true;
                    break;
                } else {
                    b1Var.run();
                    break;
                }
        }
    }
}
