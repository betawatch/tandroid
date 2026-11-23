package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fi implements org.telegram.messenger.fs {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai.x0 b;
    public final /* synthetic */ bn c;
    public final /* synthetic */ bn d;

    public fi(bn bnVar, int i7, ai.x0 x0Var, bn bnVar2) {
        this.d = bnVar;
        this.a = i7;
        this.b = x0Var;
        this.c = bnVar2;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.ks.D;
        if (i7 == i12 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            org.telegram.messenger.g0.h3(new l2.y(this.c, i7, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.g2) this.d).currentAccount;
            org.telegram.messenger.ks.f(i11).n(this, i12);
        }
    }
}
