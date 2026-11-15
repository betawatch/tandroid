package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class fi implements org.telegram.messenger.is {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci.p0 b;
    public final /* synthetic */ an c;
    public final /* synthetic */ an d;

    public fi(an anVar, int i7, ci.p0 p0Var, an anVar2) {
        this.d = anVar;
        this.a = i7;
        this.b = p0Var;
        this.c = anVar2;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.ns.D;
        if (i7 == i12 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            org.telegram.messenger.g0.i3(new l2.x(this.c, i7, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.e2) this.d).currentAccount;
            org.telegram.messenger.ns.f(i11).n(this, i12);
        }
    }
}
