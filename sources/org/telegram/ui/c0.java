package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ z2 b;
    public final /* synthetic */ View c;

    public /* synthetic */ c0(View view, z2 z2Var) {
        this.c = view;
        this.b = z2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z2 z2Var = this.b;
                View view = this.c;
                view.post(new c0(z2Var, view));
                break;
            default:
                z2 z2Var2 = this.b;
                z2Var2.I.clear();
                z2Var2.K.set(null);
                this.c.invalidate();
                break;
        }
    }

    public /* synthetic */ c0(z2 z2Var, View view) {
        this.b = z2Var;
        this.c = view;
    }
}
