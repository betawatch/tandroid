package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ c3 b;
    public final /* synthetic */ View c;

    public /* synthetic */ c0(View view, c3 c3Var) {
        this.c = view;
        this.b = c3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c3 c3Var = this.b;
                View view = this.c;
                view.post(new c0(c3Var, view));
                break;
            default:
                c3 c3Var2 = this.b;
                c3Var2.I.clear();
                c3Var2.K.set(null);
                this.c.invalidate();
                break;
        }
    }

    public /* synthetic */ c0(c3 c3Var, View view) {
        this.b = c3Var;
        this.c = view;
    }
}
