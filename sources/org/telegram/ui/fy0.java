package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 d;
    public final /* synthetic */ org.telegram.messenger.gj e;

    public /* synthetic */ fy0(bn bnVar, Activity activity, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.messenger.gj gjVar, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = activity;
        this.d = h6Var;
        this.e = gjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.messenger.gj gjVar = this.e;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        final Activity activity = this.c;
        bn bnVar = this.b;
        final int i10 = 2;
        switch (i7) {
            case 0:
                final int i11 = 1;
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131754484, null), -1, 2, new Runnable() { // from class: org.telegram.ui.gy0
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
                }, h6Var)).j();
                bnVar.ib(gjVar);
                bnVar.kb(gjVar);
                break;
            case 1:
                final int i12 = 0;
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131754484, null), -1, 2, new Runnable() { // from class: org.telegram.ui.gy0
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
                }, h6Var)).j();
                bnVar.ib(gjVar);
                bnVar.kb(gjVar);
                break;
            default:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131754484, null), -1, 2, new Runnable() { // from class: org.telegram.ui.gy0
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
                }, h6Var)).j();
                bnVar.ib(gjVar);
                bnVar.kb(gjVar);
                break;
        }
    }
}
