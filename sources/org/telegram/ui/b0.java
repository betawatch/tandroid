package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ z2 b;
    public final /* synthetic */ View c;

    public /* synthetic */ b0(View view, z2 z2Var) {
        this.c = view;
        this.b = z2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z2 z2Var = this.b;
                View view = this.c;
                view.post(new b0(z2Var, view));
                break;
            default:
                z2 z2Var2 = this.b;
                z2Var2.J.clear();
                z2Var2.L.set(null);
                this.c.invalidate();
                break;
        }
    }

    public /* synthetic */ b0(z2 z2Var, View view) {
        this.b = z2Var;
        this.c = view;
    }
}
