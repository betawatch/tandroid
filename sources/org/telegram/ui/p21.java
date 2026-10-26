package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class p21 implements q21 {
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 c;
    public final /* synthetic */ org.telegram.ui.Components.t90 d;

    public p21(org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.t90 t90Var) {
        this.a = r2Var;
        this.b = context;
        this.c = u6Var;
        this.d = t90Var;
    }

    @Override // org.telegram.ui.q21
    public final void a() {
        AndroidUtilities.runOnUIThread(new j21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.q21
    public final void b() {
        AndroidUtilities.runOnUIThread(new fy0(16, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.q21
    public final void c() {
        org.telegram.ui.ActionBar.r2 r2Var = this.a;
        r2Var.showDialog(new tg.y0(r2Var, 3, true));
    }
}
