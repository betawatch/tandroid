package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q21 implements s21 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ org.telegram.ui.Components.lg0 d;

    public q21(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.lg0 lg0Var) {
        this.a = n2Var;
        this.b = context;
        this.c = c6Var;
        this.d = lg0Var;
    }

    @Override // org.telegram.ui.s21
    public final void a() {
        AndroidUtilities.runOnUIThread(new j21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.s21
    public final void b() {
        AndroidUtilities.runOnUIThread(new m21(2, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.s21
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        n2Var.showDialog(new ag.g2(n2Var, 3, true));
    }
}
