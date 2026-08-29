package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
