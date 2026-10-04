package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class p31 implements r31 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ org.telegram.ui.Components.yw d;

    public p31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.yw ywVar) {
        this.a = n2Var;
        this.b = context;
        this.c = d6Var;
        this.d = ywVar;
    }

    @Override // org.telegram.ui.r31
    public final void a() {
        AndroidUtilities.runOnUIThread(new j31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.r31
    public final void b() {
        AndroidUtilities.runOnUIThread(new wx0(23, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.r31
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        n2Var.showDialog(new rg.y0(n2Var, 3, true));
    }
}
