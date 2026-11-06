package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ org.telegram.messenger.ij e;

    public /* synthetic */ cy0(an anVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.messenger.ij ijVar, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = activity;
        this.d = f6Var;
        this.e = ijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.messenger.ij ijVar = this.e;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        final Activity activity = this.c;
        an anVar = this.b;
        final int i10 = 2;
        switch (i7) {
            case 0:
                final int i11 = 1;
                org.telegram.ui.Components.hc.a0(anVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.dy0
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
                }, f6Var)).j();
                anVar.eb(ijVar);
                anVar.gb(ijVar);
                break;
            case 1:
                final int i12 = 0;
                org.telegram.ui.Components.hc.a0(anVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.dy0
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
                }, f6Var)).j();
                anVar.eb(ijVar);
                anVar.gb(ijVar);
                break;
            default:
                org.telegram.ui.Components.hc.a0(anVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new Runnable() { // from class: org.telegram.ui.dy0
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
                }, f6Var)).j();
                anVar.eb(ijVar);
                anVar.gb(ijVar);
                break;
        }
    }
}
