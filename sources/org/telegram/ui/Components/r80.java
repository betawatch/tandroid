package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t80 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r80(t80 t80Var, boolean z10, int i10) {
        this.a = i10;
        this.b = t80Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r80(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
