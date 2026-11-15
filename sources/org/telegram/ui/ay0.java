package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ay0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ org.telegram.messenger.gj e;

    public /* synthetic */ ay0(an anVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.gj gjVar, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = activity;
        this.d = e6Var;
        this.e = gjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.messenger.gj gjVar = this.e;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        final Activity activity = this.c;
        an anVar = this.b;
        final int i10 = 2;
        switch (i7) {
            case 0:
                final int i11 = 1;
                org.telegram.ui.Components.cc.a0(anVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.by0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, e6Var)).j();
                anVar.ib(gjVar);
                anVar.kb(gjVar);
                break;
            case 1:
                final int i12 = 0;
                org.telegram.ui.Components.cc.a0(anVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.by0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, e6Var)).j();
                anVar.ib(gjVar);
                anVar.kb(gjVar);
                break;
            default:
                org.telegram.ui.Components.cc.a0(anVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.by0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, e6Var)).j();
                anVar.ib(gjVar);
                anVar.kb(gjVar);
                break;
        }
    }
}
