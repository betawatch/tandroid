package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oa0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ea0(oa0 oa0Var, Context context, int i7) {
        this.a = i7;
        this.b = oa0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oa0 oa0Var = this.b;
                oa0Var.d0.a(false);
                org.telegram.messenger.g0.g3(new ea0(oa0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.z0(43, context, this.b.d0.G).show();
                    break;
                }
                break;
        }
    }
}
