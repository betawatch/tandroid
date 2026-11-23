package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;
    public final /* synthetic */ org.telegram.messenger.fj e;

    public /* synthetic */ dy0(bn bnVar, Activity activity, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.messenger.fj fjVar, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = activity;
        this.d = i6Var;
        this.e = fjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.messenger.fj fjVar = this.e;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        final Activity activity = this.c;
        bn bnVar = this.b;
        final int i10 = 2;
        switch (i7) {
            case 0:
                final int i11 = 1;
                org.telegram.ui.Components.kc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new Runnable() { // from class: org.telegram.ui.ey0
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
                }, i6Var)).j();
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                break;
            case 1:
                final int i12 = 0;
                org.telegram.ui.Components.kc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new Runnable() { // from class: org.telegram.ui.ey0
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
                }, i6Var)).j();
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                break;
            default:
                org.telegram.ui.Components.kc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new Runnable() { // from class: org.telegram.ui.ey0
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
                }, i6Var)).j();
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                break;
        }
    }
}
