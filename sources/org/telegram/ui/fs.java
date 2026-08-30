package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns b;

    public /* synthetic */ fs(ns nsVar, int i10) {
        this.a = i10;
        this.b = nsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ns nsVar = this.b;
                if (nsVar.G) {
                    nsVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(nsVar.d.b);
                    break;
                }
                break;
            case 1:
                ns.Z(this.b);
                break;
            default:
                ns nsVar2 = this.b;
                nsVar2.presentFragment(xn.R9(nsVar2.E), true);
                break;
        }
    }
}
