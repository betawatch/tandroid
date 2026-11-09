package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 d;
    public final /* synthetic */ org.telegram.ui.Components.w80 e;

    public /* synthetic */ hy0(org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.w80 w80Var, int i7) {
        this.a = i7;
        this.b = f2Var;
        this.c = context;
        this.d = g6Var;
        this.e = w80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.Components.w80 w80Var = this.e;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        Context context = this.c;
        org.telegram.ui.ActionBar.f2 f2Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.hc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new du(context, 4), g6Var)).j();
                org.telegram.messenger.g0.h3(w80Var);
                break;
            case 1:
                org.telegram.ui.Components.hc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new du(context, 3), g6Var)).j();
                org.telegram.messenger.g0.h3(w80Var);
                break;
            default:
                org.telegram.ui.Components.hc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new du(context, 7), g6Var)).j();
                org.telegram.messenger.g0.h3(w80Var);
                break;
        }
    }
}
