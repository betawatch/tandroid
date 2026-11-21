package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 d;
    public final /* synthetic */ org.telegram.ui.Components.ou e;

    public /* synthetic */ hy0(org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ou ouVar, int i7) {
        this.a = i7;
        this.b = g2Var;
        this.c = context;
        this.d = h6Var;
        this.e = ouVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.Components.ou ouVar = this.e;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        Context context = this.c;
        org.telegram.ui.ActionBar.g2 g2Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.lc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new fu(context, 4), h6Var)).j();
                org.telegram.messenger.g0.g3(ouVar);
                break;
            case 1:
                org.telegram.ui.Components.lc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new fu(context, 3), h6Var)).j();
                org.telegram.messenger.g0.g3(ouVar);
                break;
            default:
                org.telegram.ui.Components.lc.b0(g2Var).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new fu(context, 7), h6Var)).j();
                org.telegram.messenger.g0.g3(ouVar);
                break;
        }
    }
}
