package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ org.telegram.ui.Components.hh0 e;

    public /* synthetic */ cy0(org.telegram.ui.ActionBar.e2 e2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.hh0 hh0Var, int i7) {
        this.a = i7;
        this.b = e2Var;
        this.c = context;
        this.d = e6Var;
        this.e = hh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.Components.hh0 hh0Var = this.e;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        Context context = this.c;
        org.telegram.ui.ActionBar.e2 e2Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.cc.a0(e2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new du(context, 4), e6Var)).j();
                org.telegram.messenger.g0.h3(hh0Var);
                break;
            case 1:
                org.telegram.ui.Components.cc.a0(e2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new du(context, 3), e6Var)).j();
                org.telegram.messenger.g0.h3(hh0Var);
                break;
            default:
                org.telegram.ui.Components.cc.a0(e2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new du(context, 7), e6Var)).j();
                org.telegram.messenger.g0.h3(hh0Var);
                break;
        }
    }
}
