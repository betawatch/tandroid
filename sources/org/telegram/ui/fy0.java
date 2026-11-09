package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 d;
    public final /* synthetic */ org.telegram.messenger.ij e;

    public /* synthetic */ fy0(cn cnVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.messenger.ij ijVar, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = activity;
        this.d = g6Var;
        this.e = ijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.messenger.ij ijVar = this.e;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        final Activity activity = this.c;
        cn cnVar = this.b;
        final int i10 = 2;
        switch (i7) {
            case 0:
                final int i11 = 1;
                org.telegram.ui.Components.hc.a0(cnVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.gy0
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
                }, g6Var)).j();
                cnVar.hb(ijVar);
                cnVar.jb(ijVar);
                break;
            case 1:
                final int i12 = 0;
                org.telegram.ui.Components.hc.a0(cnVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.gy0
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
                }, g6Var)).j();
                cnVar.hb(ijVar);
                cnVar.jb(ijVar);
                break;
            default:
                org.telegram.ui.Components.hc.a0(cnVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.gy0
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
                }, g6Var)).j();
                cnVar.hb(ijVar);
                cnVar.jb(ijVar);
                break;
        }
    }
}
