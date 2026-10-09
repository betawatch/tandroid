package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk b;

    public /* synthetic */ zj(bk bkVar, int i10) {
        this.a = i10;
        this.b = bkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bk bkVar = this.b;
                if (bkVar.f != null) {
                    bkVar.v = org.telegram.messenger.bi.g(new StringBuilder("+"), bkVar.f.phone, hf.b.c());
                    bkVar.s = bkVar.f;
                    AndroidUtilities.runOnUIThread(new zj(bkVar, 1));
                    break;
                }
                break;
            default:
                bk bkVar2 = this.b;
                bkVar2.c.l(bkVar2.v, false);
                break;
        }
    }
}
