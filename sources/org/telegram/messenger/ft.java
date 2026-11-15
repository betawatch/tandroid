package org.telegram.messenger;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class ft implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s10 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ ft(s10 s10Var, Exception exc, int i7) {
        this.a = i7;
        this.b = s10Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(null, this.c.getMessage());
                break;
            default:
                this.b.a(null, this.c.getMessage());
                break;
        }
    }
}
