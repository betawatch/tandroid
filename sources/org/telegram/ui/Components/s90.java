package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ s90(da0 da0Var, Context context, int i7) {
        this.a = i7;
        this.b = da0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                da0 da0Var = this.b;
                da0Var.c0.a(false);
                org.telegram.messenger.g0.h3(new s90(da0Var, this.c, 1));
                break;
            default:
                Context context = this.c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.w0(43, context, this.b.c0.F).show();
                    break;
                }
                break;
        }
    }
}
