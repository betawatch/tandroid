package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i70 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ g70(i70 i70Var, boolean z10, int i7) {
        this.a = i7;
        this.b = i70Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new g70(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
