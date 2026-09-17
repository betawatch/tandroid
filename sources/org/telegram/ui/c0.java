package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ b3 b;
    public final /* synthetic */ View c;

    public /* synthetic */ c0(View view, b3 b3Var) {
        this.c = view;
        this.b = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b3 b3Var = this.b;
                View view = this.c;
                view.post(new c0(b3Var, view));
                break;
            default:
                b3 b3Var2 = this.b;
                b3Var2.I.clear();
                b3Var2.K.set(null);
                this.c.invalidate();
                break;
        }
    }

    public /* synthetic */ c0(b3 b3Var, View view) {
        this.b = b3Var;
        this.c = view;
    }
}
