package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uk0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ lk0(uk0 uk0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = uk0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uk0 uk0Var = this.b;
                NotificationCenter.getInstance(uk0Var.b).doOnIdle(new lk0(uk0Var, this.c, 1));
                break;
            default:
                uk0.a(this.b, this.c);
                break;
        }
    }
}
