package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ a3(f3 f3Var, int i7, int i10) {
        this.a = i10;
        this.b = f3Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new a3(this.b, this.c, 2));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new a3(this.b, this.c, 3));
                break;
            case 2:
                this.b.c(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
