package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class j80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l80 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ j80(l80 l80Var, boolean z10, int i10) {
        this.a = i10;
        this.b = l80Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j80(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
