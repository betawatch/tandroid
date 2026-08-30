package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m80 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ k80(m80 m80Var, boolean z4, int i10) {
        this.a = i10;
        this.b = m80Var;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k80(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
