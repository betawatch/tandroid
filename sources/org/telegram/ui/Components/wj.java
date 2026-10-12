package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj b;

    public /* synthetic */ wj(yj yjVar, int i10) {
        this.a = i10;
        this.b = yjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yj yjVar = this.b;
                if (yjVar.f != null) {
                    yjVar.v = org.telegram.messenger.yh.g(new StringBuilder("+"), yjVar.f.phone, jf.b.c());
                    yjVar.s = yjVar.f;
                    AndroidUtilities.runOnUIThread(new wj(yjVar, 1));
                    break;
                }
                break;
            default:
                yj yjVar2 = this.b;
                yjVar2.c.l(yjVar2.v, false);
                break;
        }
    }
}
