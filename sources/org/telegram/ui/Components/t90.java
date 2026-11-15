package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ t90(da0 da0Var, Context context, int i7) {
        this.a = i7;
        this.b = da0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                da0 da0Var = this.b;
                da0Var.d0.a(false);
                org.telegram.messenger.g0.h3(new t90(da0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.x0(43, context, this.b.d0.G).show();
                    break;
                }
                break;
        }
    }
}
