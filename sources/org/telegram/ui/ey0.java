package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ey0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ org.telegram.ui.Components.v80 e;

    public /* synthetic */ ey0(org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.v80 v80Var, int i7) {
        this.a = i7;
        this.b = f2Var;
        this.c = context;
        this.d = f6Var;
        this.e = v80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.Components.v80 v80Var = this.e;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        Context context = this.c;
        org.telegram.ui.ActionBar.f2 f2Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.hc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new bu(context, 4), f6Var)).j();
                org.telegram.messenger.g0.h3(v80Var);
                break;
            case 1:
                org.telegram.ui.Components.hc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new bu(context, 3), f6Var)).j();
                org.telegram.messenger.g0.h3(v80Var);
                break;
            default:
                org.telegram.ui.Components.hc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new bu(context, 7), f6Var)).j();
                org.telegram.messenger.g0.h3(v80Var);
                break;
        }
    }
}
