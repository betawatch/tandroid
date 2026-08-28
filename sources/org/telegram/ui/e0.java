package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e3 b;
    public final /* synthetic */ View c;

    public /* synthetic */ e0(View view, e3 e3Var) {
        this.c = view;
        this.b = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e3 e3Var = this.b;
                View view = this.c;
                view.post(new e0(e3Var, view));
                break;
            default:
                e3 e3Var2 = this.b;
                e3Var2.E.clear();
                e3Var2.G.set(null);
                this.c.invalidate();
                break;
        }
    }

    public /* synthetic */ e0(e3 e3Var, View view) {
        this.b = e3Var;
        this.c = view;
    }
}
