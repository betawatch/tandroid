package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k80 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ i80(k80 k80Var, boolean z10, int i10) {
        this.a = i10;
        this.b = k80Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i80(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
