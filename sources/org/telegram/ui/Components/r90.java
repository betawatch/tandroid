package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
