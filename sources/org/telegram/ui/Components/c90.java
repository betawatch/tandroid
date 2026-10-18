package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e90 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c90(e90 e90Var, boolean z10, int i10) {
        this.a = i10;
        this.b = e90Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c90(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
