package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o31 implements q31 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ org.telegram.ui.Components.oy d;

    public o31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.oy oyVar) {
        this.a = n2Var;
        this.b = context;
        this.c = d6Var;
        this.d = oyVar;
    }

    @Override // org.telegram.ui.q31
    public final void a() {
        AndroidUtilities.runOnUIThread(new i31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.q31
    public final void b() {
        AndroidUtilities.runOnUIThread(new by0(20, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.q31
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        n2Var.showDialog(new rg.x0(n2Var, 3, true));
    }
}
