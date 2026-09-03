package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ os b;

    public /* synthetic */ gs(os osVar, int i10) {
        this.a = i10;
        this.b = osVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                os osVar = this.b;
                if (osVar.G) {
                    osVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(osVar.d.b);
                    break;
                }
                break;
            case 1:
                os.Z(this.b);
                break;
            default:
                os osVar2 = this.b;
                osVar2.presentFragment(xn.R9(osVar2.E), true);
                break;
        }
    }
}
