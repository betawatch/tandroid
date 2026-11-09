package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hi implements org.telegram.messenger.ls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai.a1 b;
    public final /* synthetic */ cn c;
    public final /* synthetic */ cn d;

    public hi(cn cnVar, int i7, ai.a1 a1Var, cn cnVar2) {
        this.d = cnVar;
        this.a = i7;
        this.b = a1Var;
        this.c = cnVar2;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.qs.D;
        if (i7 == i12 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            org.telegram.messenger.g0.i3(new l2.z(this.c, i7, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.f2) this.d).currentAccount;
            org.telegram.messenger.qs.f(i11).n(this, i12);
        }
    }
}
