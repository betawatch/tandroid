package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ls b;

    public /* synthetic */ bs(ls lsVar, int i10) {
        this.a = i10;
        this.b = lsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ls.Z(this.b);
                break;
            case 1:
                ls lsVar = this.b;
                if (lsVar.J) {
                    lsVar.d.d.requestFocus();
                    AndroidUtilities.showKeyboard(lsVar.d.d);
                    break;
                }
                break;
            default:
                ls lsVar2 = this.b;
                lsVar2.presentFragment(wn.ea(lsVar2.H), true);
                break;
        }
    }
}
