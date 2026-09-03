package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k31 implements m31 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ org.telegram.ui.Components.b90 d;

    public k31(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.b90 b90Var) {
        this.a = p2Var;
        this.b = context;
        this.c = g6Var;
        this.d = b90Var;
    }

    @Override // org.telegram.ui.m31
    public final void a() {
        AndroidUtilities.runOnUIThread(new e31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.m31
    public final void b() {
        AndroidUtilities.runOnUIThread(new h21(6, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.m31
    public final void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        p2Var.showDialog(new fg.n1(p2Var, 3, true));
    }
}
