package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    public /* synthetic */ pf0(t3 t3Var, int i10) {
        this.a = i10;
        this.b = t3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run("CANCELLED");
                break;
            default:
                AndroidUtilities.runOnUIThread(new pf0(this.b, 0));
                break;
        }
    }
}
