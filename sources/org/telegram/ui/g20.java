package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ gg.a c;

    public /* synthetic */ g20(Context context, gg.a aVar, int i10) {
        this.a = i10;
        this.b = context;
        this.c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                h hVar = new h(this, 18);
                Context context = this.b;
                org.telegram.ui.Components.m8 m8Var = new org.telegram.ui.Components.m8(context, false, hVar, 1);
                gg.j jVar = this.c.c;
                m8Var.e(jVar != null ? jVar.C : 0, 0);
                m8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, false);
                h3Var.setCustomView(m8Var);
                h3Var.setDimBehind(false);
                h3Var.show();
                break;
            default:
                h hVar2 = new h(this, 19);
                Context context2 = this.b;
                org.telegram.ui.Components.m8 m8Var2 = new org.telegram.ui.Components.m8(context2, false, hVar2, 2);
                gg.j jVar2 = this.c.c;
                m8Var2.e(jVar2 == null ? 0 : jVar2.B, 0);
                m8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.h3 h3Var2 = new org.telegram.ui.ActionBar.h3(context2, false);
                h3Var2.setCustomView(m8Var2);
                h3Var2.setDimBehind(false);
                h3Var2.show();
                break;
        }
    }
}
