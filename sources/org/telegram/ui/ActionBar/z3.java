package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ z3(i4 i4Var, int i7) {
        this.a = i7;
        this.b = i4Var;
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
