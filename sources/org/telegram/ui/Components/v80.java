package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x80 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ v80(x80 x80Var, boolean z10, int i10) {
        this.a = i10;
        this.b = x80Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new v80(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
