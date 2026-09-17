package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
