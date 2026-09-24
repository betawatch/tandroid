package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ak0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ rj0(ak0 ak0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = ak0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ak0 ak0Var = this.b;
                NotificationCenter.getInstance(ak0Var.b).doOnIdle(new rj0(ak0Var, this.c, 1));
                break;
            default:
                ak0.a(this.b, this.c);
                break;
        }
    }
}
