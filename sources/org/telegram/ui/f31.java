package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f31 implements h31 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ org.telegram.ui.Components.a90 d;

    public f31(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.a90 a90Var) {
        this.a = p2Var;
        this.b = context;
        this.c = g6Var;
        this.d = a90Var;
    }

    @Override // org.telegram.ui.h31
    public final void a() {
        AndroidUtilities.runOnUIThread(new z21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.h31
    public final void b() {
        AndroidUtilities.runOnUIThread(new w01(7, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.h31
    public final void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        p2Var.showDialog(new fg.n1(p2Var, 3, true));
    }
}
