package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ c1(int i3, Context context, org.telegram.ui.ActionBar.s1 s1Var) {
        this.a = i3;
        this.b = s1Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Context context = this.c;
        org.telegram.ui.ActionBar.s1 s1Var = this.b;
        switch (i3) {
            case 0:
                if (s1Var != null) {
                    s1Var.dismiss();
                }
                sf.c.t(context, org.telegram.messenger.bd.M0(2131752895, null));
                break;
            default:
                if (s1Var != null) {
                    s1Var.dismiss();
                }
                sf.c.t(context, org.telegram.messenger.bd.M0(2131752895, null));
                break;
        }
    }
}
