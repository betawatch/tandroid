package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ rg.a c;

    public /* synthetic */ l20(Context context, rg.a aVar, int i10) {
        this.a = i10;
        this.b = context;
        this.c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.b;
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8(context, false, gVar, 1);
                rg.g gVar2 = this.c.c;
                t8Var.e(gVar2 != null ? gVar2.C : 0, 0);
                t8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, false);
                h3Var.setCustomView(t8Var);
                h3Var.setDimBehind(false);
                h3Var.show();
                break;
            default:
                g gVar3 = new g(this, 19);
                Context context2 = this.b;
                org.telegram.ui.Components.t8 t8Var2 = new org.telegram.ui.Components.t8(context2, false, gVar3, 2);
                rg.g gVar4 = this.c.c;
                t8Var2.e(gVar4 == null ? 0 : gVar4.B, 0);
                t8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.h3 h3Var2 = new org.telegram.ui.ActionBar.h3(context2, false);
                h3Var2.setCustomView(t8Var2);
                h3Var2.setDimBehind(false);
                h3Var2.show();
                break;
        }
    }
}
