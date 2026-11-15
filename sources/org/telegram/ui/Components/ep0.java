package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ep0(tr0 tr0Var, int i7, int i10) {
        this.a = i10;
        this.b = tr0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h.scrollBy(0, this.c);
                break;
            case 1:
                this.b.h.scrollBy(0, this.c);
                break;
            default:
                this.b.h.scrollBy(0, this.c);
                break;
        }
    }
}
