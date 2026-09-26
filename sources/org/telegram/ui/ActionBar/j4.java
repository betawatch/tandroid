package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4 b;

    public /* synthetic */ j4(t4 t4Var, int i10) {
        this.a = i10;
        this.b = t4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.g();
                break;
            case 1:
                this.b.g();
                break;
            default:
                this.b.g();
                break;
        }
    }
}
