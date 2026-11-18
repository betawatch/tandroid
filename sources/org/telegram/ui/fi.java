package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fi implements org.telegram.messenger.fs {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi.t4 b;
    public final /* synthetic */ bn c;
    public final /* synthetic */ bn d;

    public fi(bn bnVar, int i7, bi.t4 t4Var, bn bnVar2) {
        this.d = bnVar;
        this.a = i7;
        this.b = t4Var;
        this.c = bnVar2;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.ks.D;
        if (i7 == i12 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            org.telegram.messenger.g0.h3(new l2.x(this.c, i7, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.h2) this.d).currentAccount;
            org.telegram.messenger.ks.f(i11).n(this, i12);
        }
    }
}
