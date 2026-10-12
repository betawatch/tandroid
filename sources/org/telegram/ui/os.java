package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class os implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ws b;

    public /* synthetic */ os(ws wsVar, int i10) {
        this.a = i10;
        this.b = wsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ws wsVar = this.b;
                if (wsVar.J) {
                    wsVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(wsVar.d.b);
                    break;
                }
                break;
            case 1:
                ws.Z(this.b);
                break;
            default:
                ws wsVar2 = this.b;
                wsVar2.presentFragment(fo.W9(wsVar2.H), true);
                break;
        }
    }
}
