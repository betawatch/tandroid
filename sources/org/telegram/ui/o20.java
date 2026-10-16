package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class o20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ tg.g c;

    public /* synthetic */ o20(Context context, tg.g gVar, int i10) {
        this.a = i10;
        this.b = context;
        this.c = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g gVar = new g(this, 18);
                Context context = this.b;
                org.telegram.ui.Components.x8 x8Var = new org.telegram.ui.Components.x8(context, false, gVar, 1);
                tg.o oVar = this.c.c;
                x8Var.e(oVar != null ? oVar.I : 0, 0);
                x8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, false);
                e3Var.setCustomView(x8Var);
                e3Var.setDimBehind(false);
                e3Var.show();
                break;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.b;
                org.telegram.ui.Components.x8 x8Var2 = new org.telegram.ui.Components.x8(context2, false, gVar2, 2);
                tg.o oVar2 = this.c.c;
                x8Var2.e(oVar2 == null ? 0 : oVar2.H, 0);
                x8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.e3 e3Var2 = new org.telegram.ui.ActionBar.e3(context2, false);
                e3Var2.setCustomView(x8Var2);
                e3Var2.setDimBehind(false);
                e3Var2.show();
                break;
        }
    }
}
