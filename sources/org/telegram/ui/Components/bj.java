package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj b;

    public /* synthetic */ bj(dj djVar, int i3) {
        this.a = i3;
        this.b = djVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dj djVar = this.b;
                if (djVar.f != null) {
                    djVar.w = org.telegram.messenger.k5.i(new StringBuilder("+"), djVar.f.phone, mf.b.c());
                    djVar.s = djVar.f;
                    org.telegram.messenger.g0.h3(new bj(djVar, 1));
                    break;
                }
                break;
            default:
                dj djVar2 = this.b;
                djVar2.c.l(djVar2.w, false);
                break;
        }
    }
}
