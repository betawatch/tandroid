package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                    akVar.v = org.telegram.messenger.a2.j(new StringBuilder("+"), akVar.f.phone, gf.b.c());
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
