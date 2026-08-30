package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d31 implements f31 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.ui.Components.i80 d;

    public d31(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.i80 i80Var) {
        this.a = p2Var;
        this.b = context;
        this.c = f6Var;
        this.d = i80Var;
    }

    @Override // org.telegram.ui.f31
    public final void a() {
        AndroidUtilities.runOnUIThread(new x21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.f31
    public final void b() {
        AndroidUtilities.runOnUIThread(new l01(8, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.f31
    public final void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        p2Var.showDialog(new eg.o1(p2Var, 3, true));
    }
}
