package org.telegram.ui;

import android.os.Bundle;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class q80 implements org.telegram.messenger.ap {
    public final /* synthetic */ o60 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ LaunchActivity h;

    public q80(LaunchActivity launchActivity, o60 o60Var, String str, org.telegram.ui.ActionBar.h2 h2Var, long j3, Integer num, Bundle bundle) {
        this.h = launchActivity;
        this.a = o60Var;
        this.b = str;
        this.c = h2Var;
        this.d = j3;
        this.e = num;
        this.f = bundle;
    }

    @Override // org.telegram.messenger.ap
    public final void a() {
        LaunchActivity launchActivity = this.h;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.b5.r0((org.telegram.ui.ActionBar.h2) i5.c.h(1, launchActivity.e0), null, org.telegram.messenger.gd.M0(2131748883, null), null);
        }
        try {
            this.a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.ap
    public final void f(boolean z10) {
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
        org.telegram.ui.ActionBar.h2 h2Var = this.c;
        if (str == null || !(h2Var instanceof bn) || ((bn) h2Var).a() != j3) {
            if (h2Var instanceof bn) {
                bn bnVar = (bn) h2Var;
                if (bnVar.a() == j3 && this.e == null) {
                    org.telegram.messenger.g0.E3(5.0f, bnVar.A0, null);
                    org.telegram.messenger.q2.E.a();
                    rj rjVar = bnVar.a0;
                    for (int i7 = 0; i7 < rjVar.getChildCount(); i7++) {
                        org.telegram.messenger.g0.E3(5.0f, rjVar.getChildAt(i7), null);
                    }
                    org.telegram.ui.ActionBar.k actionBar = bnVar.getActionBar();
                    for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
                        org.telegram.messenger.g0.E3(5.0f, actionBar.getChildAt(i10), null);
                    }
                }
            }
            h2Var = new bn(this.f);
            ((ActionBarLayout) launchActivity.M()).S(h2Var);
        }
        org.telegram.messenger.g0.h3(new di.i2(this, this.b, this.d, h2Var, 21), 150L);
    }
}
