package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
