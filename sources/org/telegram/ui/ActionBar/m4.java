package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w4 b;

    public /* synthetic */ m4(w4 w4Var, int i10) {
        this.a = i10;
        this.b = w4Var;
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
