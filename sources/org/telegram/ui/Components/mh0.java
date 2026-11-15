package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vh0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ mh0(vh0 vh0Var, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = vh0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vh0 vh0Var = this.b;
                org.telegram.messenger.ns.f(vh0Var.b).d(new mh0(vh0Var, this.c, 1));
                break;
            default:
                vh0.a(this.b, this.c);
                break;
        }
    }
}
