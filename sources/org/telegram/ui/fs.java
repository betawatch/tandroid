package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                if (nsVar.J) {
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
                nsVar2.presentFragment(xn.R9(nsVar2.H), true);
                break;
        }
    }
}
