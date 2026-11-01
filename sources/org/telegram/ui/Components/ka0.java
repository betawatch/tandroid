package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ka0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ua0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ka0(ua0 ua0Var, Context context, int i10) {
        this.a = i10;
        this.b = ua0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ua0 ua0Var = this.b;
                ua0Var.c0.a(false);
                org.telegram.messenger.i0.g3(new ka0(ua0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (org.telegram.messenger.i0.E1(context)) {
                    new kg.i1(43, context, this.b.c0.F).show();
                    break;
                }
                break;
        }
    }
}
