package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.messenger.x10 e;
    public final /* synthetic */ long f;

    public /* synthetic */ m1(int i7, long j3, long j10, org.telegram.messenger.x10 x10Var, long j11, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = j3;
        this.d = j10;
        this.e = x10Var;
        this.f = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = this.b;
                long j3 = di.x8.y(i7, false).p().amount;
                long j10 = this.c;
                org.telegram.messenger.x10 x10Var = this.e;
                long j11 = this.f;
                if (j3 >= j10) {
                    x10Var.a(Long.valueOf(j11));
                    break;
                } else {
                    Activity u02 = org.telegram.messenger.g0.u0();
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    org.telegram.ui.ActionBar.i6 bVar = (PhotoViewer.p1().P1() || (T != null && T.hasShownSheet())) ? new fi.b() : T != null ? T.getResourceProvider() : null;
                    if (u02 != null) {
                        long j12 = this.d;
                        new di.fb(u02, bVar, j10, 13, org.telegram.messenger.n5.s(i7, j12), new org.telegram.ui.a6(1, j11, x10Var), j12).show();
                        break;
                    }
                }
                break;
            default:
                int i10 = this.b;
                m1 m1Var = new m1(i10, this.c, this.d, this.e, this.f, 0);
                if (!di.x8.y(i10, false).e) {
                    di.x8 y10 = di.x8.y(i10, false);
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
