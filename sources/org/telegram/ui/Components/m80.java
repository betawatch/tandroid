package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n80 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ m80(n80 n80Var, boolean z4, boolean z10, int i10) {
        this.a = i10;
        this.b = n80Var;
        this.c = z4;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m80(this.b, this.c, this.d, 1));
                break;
            default:
                n80 n80Var = this.b;
                n80Var.setJoinRequest(this.c);
                n80Var.setJoinToSend(this.d);
                break;
        }
    }
}
