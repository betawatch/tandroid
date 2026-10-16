package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
