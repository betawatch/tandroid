package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k31 implements m31 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.ui.Components.z80 d;

    public k31(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.z80 z80Var) {
        this.a = p2Var;
        this.b = context;
        this.c = f6Var;
        this.d = z80Var;
    }

    @Override // org.telegram.ui.m31
    public final void a() {
        AndroidUtilities.runOnUIThread(new e31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.m31
    public final void b() {
        AndroidUtilities.runOnUIThread(new b11(7, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.m31
    public final void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        p2Var.showDialog(new eg.o1(p2Var, 3, true));
    }
}
