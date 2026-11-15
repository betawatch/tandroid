package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ea0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ u90(ea0 ea0Var, Context context, int i7) {
        this.a = i7;
        this.b = ea0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ea0 ea0Var = this.b;
                ea0Var.d0.a(false);
                org.telegram.messenger.g0.h3(new u90(ea0Var, this.c, 1));
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
