package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class fi implements org.telegram.messenger.ls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai.a1 b;
    public final /* synthetic */ an c;
    public final /* synthetic */ an d;

    public fi(an anVar, int i7, ai.a1 a1Var, an anVar2) {
        this.d = anVar;
        this.a = i7;
        this.b = a1Var;
        this.c = anVar2;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.qs.D;
        if (i7 == i12 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            org.telegram.messenger.g0.i3(new l2.a0(this.c, i7, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.f2) this.d).currentAccount;
            org.telegram.messenger.qs.f(i11).n(this, i12);
        }
    }
}
