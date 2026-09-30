package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zj b;

    public /* synthetic */ xj(zj zjVar, int i10) {
        this.a = i10;
        this.b = zjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zj zjVar = this.b;
                if (zjVar.f != null) {
                    zjVar.v = org.telegram.messenger.ok.h(new StringBuilder("+"), zjVar.f.phone, gf.b.c());
                    zjVar.s = zjVar.f;
                    AndroidUtilities.runOnUIThread(new xj(zjVar, 1));
                    break;
                }
                break;
            default:
                zj zjVar2 = this.b;
                zjVar2.c.l(zjVar2.v, false);
                break;
        }
    }
}
