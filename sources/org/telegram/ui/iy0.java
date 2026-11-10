package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 d;
    public final /* synthetic */ org.telegram.ui.Components.r80 e;

    public /* synthetic */ iy0(org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.r80 r80Var, int i7) {
        this.a = i7;
        this.b = f2Var;
        this.c = context;
        this.d = h6Var;
        this.e = r80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.Components.r80 r80Var = this.e;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        Context context = this.c;
        org.telegram.ui.ActionBar.f2 f2Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.gc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new eu(context, 4), h6Var)).j();
                org.telegram.messenger.g0.h3(r80Var);
                break;
            case 1:
                org.telegram.ui.Components.gc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new eu(context, 3), h6Var)).j();
                org.telegram.messenger.g0.h3(r80Var);
                break;
            default:
                org.telegram.ui.Components.gc.a0(f2Var).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new eu(context, 7), h6Var)).j();
                org.telegram.messenger.g0.h3(r80Var);
                break;
        }
    }
}
