package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uh0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ lh0(uh0 uh0Var, TLObject tLObject, int i3) {
        this.a = i3;
        this.b = uh0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uh0 uh0Var = this.b;
                org.telegram.messenger.hs.f(uh0Var.b).d(new lh0(uh0Var, this.c, 1));
                break;
            default:
                uh0.a(this.b, this.c);
                break;
        }
    }
}
