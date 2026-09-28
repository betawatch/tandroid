package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class es implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ms b;

    public /* synthetic */ es(ms msVar, int i10) {
        this.a = i10;
        this.b = msVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ms msVar = this.b;
                if (msVar.J) {
                    msVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(msVar.d.b);
                    break;
                }
                break;
            case 1:
                ms.Z(this.b);
                break;
            default:
                ms msVar2 = this.b;
                msVar2.presentFragment(wn.R9(msVar2.H), true);
                break;
        }
    }
}
