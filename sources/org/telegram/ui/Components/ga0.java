package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ga0(qa0 qa0Var, Context context, int i7) {
        this.a = i7;
        this.b = qa0Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qa0 qa0Var = this.b;
                qa0Var.d0.a(false);
                org.telegram.messenger.g0.g3(new ga0(qa0Var, this.c, 1));
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
