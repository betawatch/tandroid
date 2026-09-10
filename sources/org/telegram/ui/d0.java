package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ c3 b;
    public final /* synthetic */ View c;

    public /* synthetic */ d0(View view, c3 c3Var) {
        this.c = view;
        this.b = c3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c3 c3Var = this.b;
                View view = this.c;
                view.post(new d0(c3Var, view));
                break;
            default:
                c3 c3Var2 = this.b;
                c3Var2.I.clear();
                c3Var2.K.set(null);
                this.c.invalidate();
                break;
        }
    }

    public /* synthetic */ d0(c3 c3Var, View view) {
        this.b = c3Var;
        this.c = view;
    }
}
