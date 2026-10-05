package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y80 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ w80(y80 y80Var, boolean z10, int i10) {
        this.a = i10;
        this.b = y80Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w80(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
