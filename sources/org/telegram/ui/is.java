package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class is implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qs b;

    public /* synthetic */ is(qs qsVar, int i10) {
        this.a = i10;
        this.b = qsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qs qsVar = this.b;
                if (qsVar.J) {
                    qsVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(qsVar.d.b);
                    break;
                }
                break;
            case 1:
                qs.Z(this.b);
                break;
            default:
                qs qsVar2 = this.b;
                qsVar2.presentFragment(zn.W9(qsVar2.H), true);
                break;
        }
    }
}
