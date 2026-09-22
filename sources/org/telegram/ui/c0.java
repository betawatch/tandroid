package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a3 b;
    public final /* synthetic */ View c;

    public /* synthetic */ c0(View view, a3 a3Var) {
        this.c = view;
        this.b = a3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a3 a3Var = this.b;
                View view = this.c;
                view.post(new c0(a3Var, view));
                break;
            default:
                a3 a3Var2 = this.b;
                a3Var2.I.clear();
                a3Var2.K.set(null);
                this.c.invalidate();
                break;
        }
    }

    public /* synthetic */ c0(a3 a3Var, View view) {
        this.b = a3Var;
        this.c = view;
    }
}
