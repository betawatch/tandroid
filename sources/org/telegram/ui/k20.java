package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class k20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ sg.a c;

    public /* synthetic */ k20(Context context, sg.a aVar, int i10) {
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
                org.telegram.ui.Components.s8 s8Var = new org.telegram.ui.Components.s8(context, false, gVar, 1);
                sg.f fVar = this.c.c;
                s8Var.e(fVar != null ? fVar.C : 0, 0);
                s8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, false);
                f3Var.setCustomView(s8Var);
                f3Var.setDimBehind(false);
                f3Var.show();
                break;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.b;
                org.telegram.ui.Components.s8 s8Var2 = new org.telegram.ui.Components.s8(context2, false, gVar2, 2);
                sg.f fVar2 = this.c.c;
                s8Var2.e(fVar2 == null ? 0 : fVar2.B, 0);
                s8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context2, false);
                f3Var2.setCustomView(s8Var2);
                f3Var2.setDimBehind(false);
                f3Var2.show();
                break;
        }
    }
}
