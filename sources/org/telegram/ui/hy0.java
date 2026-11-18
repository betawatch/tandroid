package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;
    public final /* synthetic */ org.telegram.ui.Components.dw e;

    public /* synthetic */ hy0(org.telegram.ui.ActionBar.h2 h2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.dw dwVar, int i7) {
        this.a = i7;
        this.b = h2Var;
        this.c = context;
        this.d = i6Var;
        this.e = dwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.Components.dw dwVar = this.e;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        Context context = this.c;
        org.telegram.ui.ActionBar.h2 h2Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.lc.b0(h2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131754485, null), -1, 2, new fu(context, 4), i6Var)).j();
                org.telegram.messenger.g0.g3(dwVar);
                break;
            case 1:
                org.telegram.ui.Components.lc.b0(h2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131754485, null), -1, 2, new fu(context, 3), i6Var)).j();
                org.telegram.messenger.g0.g3(dwVar);
                break;
            default:
                org.telegram.ui.Components.lc.b0(h2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131754485, null), -1, 2, new fu(context, 7), i6Var)).j();
                org.telegram.messenger.g0.g3(dwVar);
                break;
        }
    }
}
