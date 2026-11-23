package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class da0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ na0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ da0(na0 na0Var, Context context, int i7) {
        this.a = i7;
        this.b = na0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                na0 na0Var = this.b;
                na0Var.d0.a(false);
                org.telegram.messenger.g0.g3(new da0(na0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.y0(43, context, this.b.d0.G).show();
                    break;
                }
                break;
        }
    }
}
