package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8(context, false, gVar, 1);
                sg.f fVar = this.c.c;
                t8Var.e(fVar != null ? fVar.C : 0, 0);
                t8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, false);
                f3Var.setCustomView(t8Var);
                f3Var.setDimBehind(false);
                f3Var.show();
                break;
            default:
                g gVar2 = new g(this, 19);
                Context context2 = this.b;
                org.telegram.ui.Components.t8 t8Var2 = new org.telegram.ui.Components.t8(context2, false, gVar2, 2);
                sg.f fVar2 = this.c.c;
                t8Var2.e(fVar2 == null ? 0 : fVar2.B, 0);
                t8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(context2, false);
                f3Var2.setCustomView(t8Var2);
                f3Var2.setDimBehind(false);
                f3Var2.show();
                break;
        }
    }
}
