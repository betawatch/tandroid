package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ fg.a c;

    public /* synthetic */ h20(Context context, fg.a aVar, int i10) {
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
                fg.j jVar = this.c.c;
                m8Var.e(jVar != null ? jVar.C : 0, 0);
                m8Var.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(context, false);
                g3Var.setCustomView(m8Var);
                g3Var.setDimBehind(false);
                g3Var.show();
                break;
            default:
                h hVar2 = new h(this, 19);
                Context context2 = this.b;
                org.telegram.ui.Components.m8 m8Var2 = new org.telegram.ui.Components.m8(context2, false, hVar2, 2);
                fg.j jVar2 = this.c.c;
                m8Var2.e(jVar2 == null ? 0 : jVar2.B, 0);
                m8Var2.f(-1, 1, 1, false);
                org.telegram.ui.ActionBar.g3 g3Var2 = new org.telegram.ui.ActionBar.g3(context2, false);
                g3Var2.setCustomView(m8Var2);
                g3Var2.setDimBehind(false);
                g3Var2.show();
                break;
        }
    }
}
