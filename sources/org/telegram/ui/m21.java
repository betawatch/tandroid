package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class m21 implements o21 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ org.telegram.ui.Components.ko0 d;

    public m21(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ko0 ko0Var) {
        this.a = o2Var;
        this.b = context;
        this.c = g6Var;
        this.d = ko0Var;
    }

    @Override // org.telegram.ui.o21
    public final void a() {
        AndroidUtilities.runOnUIThread(new g21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.o21
    public final void b() {
        AndroidUtilities.runOnUIThread(new mv0(26, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.o21
    public final void c() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        o2Var.showDialog(new sg.y0(o2Var, 3, true));
    }
}
