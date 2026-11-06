package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.c20 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c0(org.telegram.messenger.c20 c20Var, int i7, int i10) {
        this.a = i10;
        this.b = c20Var;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.a(Integer.valueOf(this.c));
                break;
            default:
                org.telegram.messenger.c20 c20Var = this.b;
                if (c20Var != null) {
                    c20Var.a(Integer.valueOf(this.c));
                    break;
                }
                break;
        }
    }
}
