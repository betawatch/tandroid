package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ b3 b;
    public final /* synthetic */ View c;

    public /* synthetic */ d0(View view, b3 b3Var) {
        this.c = view;
        this.b = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b3 b3Var = this.b;
                View view = this.c;
                view.post(new d0(b3Var, view));
                break;
            default:
                b3 b3Var2 = this.b;
                b3Var2.I.clear();
                b3Var2.K.set(null);
                this.c.invalidate();
                break;
        }
    }

    public /* synthetic */ d0(b3 b3Var, View view) {
        this.b = b3Var;
        this.c = view;
    }
}
