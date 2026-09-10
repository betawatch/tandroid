package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b41 implements d41 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.ui.Components.hy d;

    public b41(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.hy hyVar) {
        this.a = p2Var;
        this.b = context;
        this.c = f6Var;
        this.d = hyVar;
    }

    @Override // org.telegram.ui.d41
    public final void a() {
        AndroidUtilities.runOnUIThread(new v31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.d41
    public final void b() {
        AndroidUtilities.runOnUIThread(new ey0(23, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.d41
    public final void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        p2Var.showDialog(new qg.a1(p2Var, 3, true));
    }
}
