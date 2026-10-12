package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c41 implements e41 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ org.telegram.ui.Components.f60 d;

    public c41(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.f60 f60Var) {
        this.a = m2Var;
        this.b = context;
        this.c = c6Var;
        this.d = f60Var;
    }

    @Override // org.telegram.ui.e41
    public final void a() {
        AndroidUtilities.runOnUIThread(new w31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.e41
    public final void b() {
        AndroidUtilities.runOnUIThread(new hz0(15, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.e41
    public final void c() {
        org.telegram.ui.ActionBar.m2 m2Var = this.a;
        m2Var.showDialog(new sg.y0(m2Var, 3, true));
    }
}
