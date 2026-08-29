package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f41 b;

    public /* synthetic */ b41(f41 f41Var, int i10) {
        this.a = i10;
        this.b = f41Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f41 f41Var = this.b;
                if (f41Var.U == null) {
                    f41Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
