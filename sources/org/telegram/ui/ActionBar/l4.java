package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4 b;

    public /* synthetic */ l4(v4 v4Var, int i10) {
        this.a = i10;
        this.b = v4Var;
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
