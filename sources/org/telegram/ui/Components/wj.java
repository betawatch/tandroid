package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                    yjVar.v = org.telegram.messenger.sk.g(new StringBuilder("+"), yjVar.f.phone, jf.b.c());
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
