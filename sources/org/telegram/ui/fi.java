package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class fi implements org.telegram.messenger.gs {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai.b1 b;
    public final /* synthetic */ bn c;
    public final /* synthetic */ bn d;

    public fi(bn bnVar, int i7, ai.b1 b1Var, bn bnVar2) {
        this.d = bnVar;
        this.a = i7;
        this.b = b1Var;
        this.c = bnVar2;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.ls.D;
        if (i7 == i12 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            org.telegram.messenger.g0.h3(new l2.x(this.c, i7, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.g2) this.d).currentAccount;
            org.telegram.messenger.ls.f(i11).n(this, i12);
        }
    }
}
