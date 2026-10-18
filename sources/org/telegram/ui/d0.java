package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d3 b;
    public final /* synthetic */ View c;

    public /* synthetic */ d0(View view, d3 d3Var) {
        this.c = view;
        this.b = d3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d3 d3Var = this.b;
                View view = this.c;
                view.post(new d0(d3Var, view));
                break;
            default:
                d3 d3Var2 = this.b;
                d3Var2.I.clear();
                d3Var2.K.set(null);
                this.c.invalidate();
                break;
        }
    }

    public /* synthetic */ d0(d3 d3Var, View view) {
        this.b = d3Var;
        this.c = view;
    }
}
