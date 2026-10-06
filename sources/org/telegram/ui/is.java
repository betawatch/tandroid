package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
