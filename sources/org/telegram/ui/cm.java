package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cm implements org.telegram.messenger.vo {
    public final /* synthetic */ di a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ hm c;

    public cm(hm hmVar, di diVar, wm wmVar) {
        this.c = hmVar;
        this.a = diVar;
        this.b = wmVar;
    }

    @Override // org.telegram.messenger.vo
    public final void a() {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }

    @Override // org.telegram.messenger.vo
    public final void j(boolean z10) {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }
}
