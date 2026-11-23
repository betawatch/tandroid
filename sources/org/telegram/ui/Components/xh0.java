package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class xh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ xh0(gi0 gi0Var, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = gi0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gi0 gi0Var = this.b;
                org.telegram.messenger.ls.f(gi0Var.b).d(new xh0(gi0Var, this.c, 1));
                break;
            default:
                gi0.a(this.b, this.c);
                break;
        }
    }
}
