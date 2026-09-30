package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class n31 implements p31 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ org.telegram.ui.Components.yn0 d;

    public n31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.yn0 yn0Var) {
        this.a = m2Var;
        this.b = context;
        this.c = d6Var;
        this.d = yn0Var;
    }

    @Override // org.telegram.ui.p31
    public final void a() {
        AndroidUtilities.runOnUIThread(new h31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.p31
    public final void b() {
        AndroidUtilities.runOnUIThread(new ix0(26, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.p31
    public final void c() {
        org.telegram.ui.ActionBar.m2 m2Var = this.a;
        m2Var.showDialog(new rg.x0(m2Var, 3, true));
    }
}
