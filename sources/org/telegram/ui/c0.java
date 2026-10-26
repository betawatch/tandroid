package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
