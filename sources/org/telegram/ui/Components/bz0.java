package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class bz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dz0 b;
    public final /* synthetic */ cz0 c;

    public /* synthetic */ bz0(dz0 dz0Var, cz0 cz0Var, int i7) {
        this.a = i7;
        this.b = dz0Var;
        this.c = cz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            case 1:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
