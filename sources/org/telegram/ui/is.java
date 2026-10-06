package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                qs.Y(this.b);
                break;
            default:
                qs qsVar2 = this.b;
                qsVar2.presentFragment(yn.Q9(qsVar2.H), true);
                break;
        }
    }
}
