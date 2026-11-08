package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2[] b;

    public /* synthetic */ m4(org.telegram.ui.ActionBar.v2[] v2VarArr, int i7) {
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
