package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ c1(int i7, Context context, org.telegram.ui.ActionBar.u1 u1Var) {
        this.a = i7;
        this.b = u1Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Context context = this.c;
        org.telegram.ui.ActionBar.u1 u1Var = this.b;
        switch (i7) {
            case 0:
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.id.M0(2131752895, null));
                break;
            default:
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t(context, org.telegram.messenger.id.M0(2131752895, null));
                break;
        }
    }
}
