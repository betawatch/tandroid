package org.telegram.ui.ActionBar;

import org.telegram.messenger.ns;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i6 b;

    public /* synthetic */ h6(i6 i6Var, int i7) {
        this.a = i7;
        this.b = i6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        i6 i6Var = this.b;
        switch (i7) {
            case 0:
                i6Var.s();
                break;
            default:
                ns.e().k(ns.t4, i6Var, Boolean.TRUE, null, -1);
                break;
        }
    }
}
