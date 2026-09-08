package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
