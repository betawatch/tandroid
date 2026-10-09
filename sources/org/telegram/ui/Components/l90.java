package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m90 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ l90(m90 m90Var, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = m90Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l90(this.b, this.c, this.d, 1));
                break;
            default:
                m90 m90Var = this.b;
                m90Var.setJoinRequest(this.c);
                m90Var.setJoinToSend(this.d);
                break;
        }
    }
}
