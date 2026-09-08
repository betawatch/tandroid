package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ks implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss b;

    public /* synthetic */ ks(ss ssVar, int i10) {
        this.a = i10;
        this.b = ssVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ss ssVar = this.b;
                if (ssVar.J) {
                    ssVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.b);
                    break;
                }
                break;
            case 1:
                ss.Z(this.b);
                break;
            default:
                ss ssVar2 = this.b;
                ssVar2.presentFragment(co.R9(ssVar2.H), true);
                break;
        }
    }
}
