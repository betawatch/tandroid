package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                z2Var2.J.clear();
                z2Var2.L.set(null);
                this.c.invalidate();
                break;
        }
    }

    public /* synthetic */ c0(z2 z2Var, View view) {
        this.b = z2Var;
        this.c = view;
    }
}
