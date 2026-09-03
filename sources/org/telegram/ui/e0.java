package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d3 b;
    public final /* synthetic */ View c;

    public /* synthetic */ e0(View view, d3 d3Var) {
        this.c = view;
        this.b = d3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d3 d3Var = this.b;
                View view = this.c;
                view.post(new e0(d3Var, view));
                break;
            default:
                d3 d3Var2 = this.b;
                d3Var2.F.clear();
                d3Var2.H.set(null);
                this.c.invalidate();
                break;
        }
    }

    public /* synthetic */ e0(d3 d3Var, View view) {
        this.b = d3Var;
        this.c = view;
    }
}
