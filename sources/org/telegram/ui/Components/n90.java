package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x90 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ n90(x90 x90Var, Context context, int i3) {
        this.a = i3;
        this.b = x90Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x90 x90Var = this.b;
                x90Var.d0.a(false);
                org.telegram.messenger.g0.h3(new n90(x90Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new vg.v0(43, context, this.b.d0.G).show();
                    break;
                }
                break;
        }
    }
}
