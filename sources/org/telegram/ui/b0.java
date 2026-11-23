package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
