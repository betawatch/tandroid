package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aj0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m1 b;
    public final /* synthetic */ aj0 c;

    public /* synthetic */ i1(m1 m1Var, aj0 aj0Var, int i10) {
        this.a = i10;
        this.b = m1Var;
        this.c = aj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.b, this.c, 1));
                break;
            default:
                this.b.removeView(this.c);
                break;
        }
    }
}
