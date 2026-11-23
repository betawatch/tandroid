package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;
    public final /* synthetic */ org.telegram.ui.Components.sh0 e;

    public /* synthetic */ fy0(org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.sh0 sh0Var, int i7) {
        this.a = i7;
        this.b = g2Var;
        this.c = context;
        this.d = i6Var;
        this.e = sh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.Components.sh0 sh0Var = this.e;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        Context context = this.c;
        org.telegram.ui.ActionBar.g2 g2Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.kc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new eu(context, 4), i6Var)).j();
                org.telegram.messenger.g0.g3(sh0Var);
                break;
            case 1:
                org.telegram.ui.Components.kc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new eu(context, 3), i6Var)).j();
                org.telegram.messenger.g0.g3(sh0Var);
                break;
            default:
                org.telegram.ui.Components.kc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new eu(context, 7), i6Var)).j();
                org.telegram.messenger.g0.g3(sh0Var);
                break;
        }
    }
}
