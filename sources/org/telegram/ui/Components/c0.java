package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
