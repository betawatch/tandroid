package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2 b;

    public /* synthetic */ gd(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.a = i7;
        this.b = v2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
