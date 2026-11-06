package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2[] b;

    public /* synthetic */ n4(org.telegram.ui.ActionBar.v2[] v2VarArr, int i7) {
        this.a = i7;
        this.b = v2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                break;
            default:
                this.b[0].dismiss();
                break;
        }
    }
}
