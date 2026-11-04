package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bi implements org.telegram.messenger.cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi.q0 b;
    public final /* synthetic */ wm c;
    public final /* synthetic */ wm d;

    public bi(wm wmVar, int i3, bi.q0 q0Var, wm wmVar2) {
        this.d = wmVar;
        this.a = i3;
        this.b = q0Var;
        this.c = wmVar2;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11;
        int i12 = org.telegram.messenger.hs.D;
        if (i3 == i12 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            org.telegram.messenger.g0.i3(new k2.a0(this.c, i3, i10, objArr, 10), 50L);
            i11 = ((org.telegram.ui.ActionBar.d2) this.d).currentAccount;
            org.telegram.messenger.hs.f(i11).n(this, i12);
        }
    }
}
