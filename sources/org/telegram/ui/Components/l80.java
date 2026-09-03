package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n80 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ l80(n80 n80Var, boolean z4, int i10) {
        this.a = i10;
        this.b = n80Var;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l80(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
