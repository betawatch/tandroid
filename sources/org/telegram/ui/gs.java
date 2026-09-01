package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
