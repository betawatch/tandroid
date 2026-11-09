package org.telegram.ui;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class p80 implements org.telegram.messenger.ep {
    public final /* synthetic */ s10 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity h;

    public p80(LaunchActivity launchActivity, s10 s10Var, String str, org.telegram.ui.ActionBar.f2 f2Var, long j3, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.a = s10Var;
        this.b = str;
        this.c = f2Var;
        this.d = j3;
        this.e = num;
        this.f = bundle;
    }

    @Override // org.telegram.messenger.ep
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.v4.r0((org.telegram.ui.ActionBar.f2) jg.g.i(1, launchActivity.d0), null, org.telegram.messenger.id.M0(2131749075, null), null);
        }
        try {
            this.a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.ep
    public final void f(boolean z9) {
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
        long j3 = this.d;
        org.telegram.ui.ActionBar.f2 f2Var = this.c;
        if (str == null || !(f2Var instanceof cn) || ((cn) f2Var).a() != j3) {
            if (f2Var instanceof cn) {
                cn cnVar = (cn) f2Var;
                if (cnVar.a() == j3 && this.e == null) {
                    org.telegram.messenger.g0.G3(5.0f, cnVar.z0, null);
                    org.telegram.messenger.p2.D.a();
                    sj sjVar = cnVar.Z;
                    for (int i7 = 0; i7 < sjVar.getChildCount(); i7++) {
                        org.telegram.messenger.g0.G3(5.0f, sjVar.getChildAt(i7), null);
                    }
                    org.telegram.ui.ActionBar.k actionBar = cnVar.getActionBar();
                    for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
                        org.telegram.messenger.g0.G3(5.0f, actionBar.getChildAt(i10), null);
                    }
                }
            }
            f2Var = new cn(this.f);
            ((ActionBarLayout) launchActivity.M()).S(f2Var);
        }
        org.telegram.messenger.g0.i3(new bi.w2(this, this.b, this.d, f2Var, 22), 150L);
    }
}
