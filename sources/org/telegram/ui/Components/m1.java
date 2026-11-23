package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.messenger.w10 e;
    public final /* synthetic */ long f;

    public /* synthetic */ m1(int i7, long j3, long j10, org.telegram.messenger.w10 w10Var, long j11, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = j3;
        this.d = j10;
        this.e = w10Var;
        this.f = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = this.b;
                long j3 = di.y8.y(i7, false).p().amount;
                long j10 = this.c;
                org.telegram.messenger.w10 w10Var = this.e;
                long j11 = this.f;
                if (j3 >= j10) {
                    w10Var.a(Long.valueOf(j11));
                    break;
                } else {
                    Activity u02 = org.telegram.messenger.g0.u0();
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    org.telegram.ui.ActionBar.i6 bVar = (PhotoViewer.p1().Q1() || (T != null && T.hasShownSheet())) ? new fi.b() : T != null ? T.getResourceProvider() : null;
                    if (u02 != null) {
                        long j12 = this.d;
                        new di.fb(u02, bVar, j10, 13, org.telegram.messenger.n5.s(i7, j12), new org.telegram.ui.b6(1, j11, w10Var), j12).show();
                        break;
                    }
                }
                break;
            default:
                int i10 = this.b;
                m1 m1Var = new m1(i10, this.c, this.d, this.e, this.f, 0);
                if (!di.y8.y(i10, false).e) {
                    di.y8 y10 = di.y8.y(i10, false);
                    y10.e = false;
                    y10.q(m1Var, false, true);
                    y10.e = true;
                    break;
                } else {
                    m1Var.run();
                    break;
                }
        }
    }
}
