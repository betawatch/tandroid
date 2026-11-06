package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ r90(ca0 ca0Var, Context context, int i7) {
        this.a = i7;
        this.b = ca0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ca0 ca0Var = this.b;
                ca0Var.c0.a(false);
                org.telegram.messenger.g0.h3(new r90(ca0Var, this.c, 1));
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
