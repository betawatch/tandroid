package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a3 b;
    public final /* synthetic */ View c;

    public /* synthetic */ d0(View view, a3 a3Var) {
        this.c = view;
        this.b = a3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a3 a3Var = this.b;
                View view = this.c;
                view.post(new d0(a3Var, view));
                break;
            default:
                a3 a3Var2 = this.b;
                a3Var2.J.clear();
                a3Var2.L.set(null);
                this.c.invalidate();
                break;
        }
    }

    public /* synthetic */ d0(a3 a3Var, View view) {
        this.b = a3Var;
        this.c = view;
    }
}
