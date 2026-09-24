package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 d;

    public /* synthetic */ mo(org.telegram.ui.ActionBar.m2 m2Var, long j3, long j10, int i10) {
        this.a = i10;
        this.d = m2Var;
        this.b = j3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.j61 j61Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new b5((ro) this.d, 4));
                break;
            default:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                z1Var.f = this.b;
                z1Var.h = this.c;
                org.telegram.ui.Components.l61 l61Var = z1Var.a;
                if (l61Var != null && (j61Var = l61Var.Y2) != null && l61Var.G) {
                    j61Var.N(true);
                    break;
                }
                break;
        }
    }
}
