package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qj0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ hj0(qj0 qj0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = qj0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qj0 qj0Var = this.b;
                NotificationCenter.getInstance(qj0Var.b).doOnIdle(new hj0(qj0Var, this.c, 1));
                break;
            default:
                qj0.a(this.b, this.c);
                break;
        }
    }
}
