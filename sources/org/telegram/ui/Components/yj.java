package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class yj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ak b;

    public /* synthetic */ yj(ak akVar, int i10) {
        this.a = i10;
        this.b = akVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ak akVar = this.b;
                if (akVar.f != null) {
                    akVar.v = org.telegram.messenger.bi.g(new StringBuilder("+"), akVar.f.phone, gf.b.c());
                    akVar.s = akVar.f;
                    AndroidUtilities.runOnUIThread(new yj(akVar, 1));
                    break;
                }
                break;
            default:
                ak akVar2 = this.b;
                akVar2.c.l(akVar2.v, false);
                break;
        }
    }
}
