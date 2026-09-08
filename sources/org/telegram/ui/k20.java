package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ tg.a c;

    public /* synthetic */ k20(Context context, tg.a aVar, int i10) {
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
                org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8(context, false, gVar, 1);
                tg.f fVar = this.c.c;
                v8Var.e(fVar != null ? fVar.C : 0, 0);
                v8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, false);
                f3Var.setCustomView(v8Var);
                f3Var.setDimBehind(false);
                f3Var.show();
                break;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.b;
                org.telegram.ui.Components.v8 v8Var2 = new org.telegram.ui.Components.v8(context2, false, gVar2, 2);
                tg.f fVar2 = this.c.c;
                v8Var2.e(fVar2 == null ? 0 : fVar2.B, 0);
                v8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context2, false);
                f3Var2.setCustomView(v8Var2);
                f3Var2.setDimBehind(false);
                f3Var2.show();
                break;
        }
    }
}
