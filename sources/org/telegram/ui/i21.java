package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class i21 implements k21 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ org.telegram.ui.Components.ho0 d;

    public i21(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ho0 ho0Var) {
        this.a = n2Var;
        this.b = context;
        this.c = d6Var;
        this.d = ho0Var;
    }

    @Override // org.telegram.ui.k21
    public final void a() {
        AndroidUtilities.runOnUIThread(new c21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.k21
    public final void b() {
        AndroidUtilities.runOnUIThread(new jv0(26, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.k21
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        n2Var.showDialog(new sg.y0(n2Var, 3, true));
    }
}
