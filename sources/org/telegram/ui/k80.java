package org.telegram.ui;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k80 implements org.telegram.messenger.vo {
    public final /* synthetic */ ly a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity h;

    public k80(LaunchActivity launchActivity, ly lyVar, String str, org.telegram.ui.ActionBar.d2 d2Var, long j10, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.a = lyVar;
        this.b = str;
        this.c = d2Var;
        this.d = j10;
        this.e = num;
        this.f = bundle;
    }

    @Override // org.telegram.messenger.vo
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.t4.t0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, launchActivity.e0), null, org.telegram.messenger.bd.M0(2131749083, null), null);
        }
        try {
            this.a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.vo
    public final void j(boolean z10) {
        try {
            this.a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        LaunchActivity launchActivity = this.h;
        if (launchActivity.isFinishing()) {
            return;
        }
        String str = this.b;
        long j10 = this.d;
        org.telegram.ui.ActionBar.d2 d2Var = this.c;
        if (str == null || !(d2Var instanceof wm) || ((wm) d2Var).a() != j10) {
            if (d2Var instanceof wm) {
                wm wmVar = (wm) d2Var;
                if (wmVar.a() == j10 && this.e == null) {
                    org.telegram.messenger.g0.G3(5.0f, wmVar.A0, null);
                    org.telegram.messenger.p2.E.a();
                    mj mjVar = wmVar.a0;
                    for (int i3 = 0; i3 < mjVar.getChildCount(); i3++) {
                        org.telegram.messenger.g0.G3(5.0f, mjVar.getChildAt(i3), null);
                    }
                    org.telegram.ui.ActionBar.k actionBar = wmVar.getActionBar();
                    for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
                        org.telegram.messenger.g0.G3(5.0f, actionBar.getChildAt(i10), null);
                    }
                }
            }
            d2Var = new wm(this.f);
            ((ActionBarLayout) launchActivity.M()).S(d2Var);
        }
        org.telegram.messenger.g0.i3(new ci.l2(this, this.b, this.d, d2Var, 22), 150L);
    }
}
