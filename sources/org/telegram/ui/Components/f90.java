package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h90 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f90(h90 h90Var, boolean z10, int i10) {
        this.a = i10;
        this.b = h90Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f90(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
