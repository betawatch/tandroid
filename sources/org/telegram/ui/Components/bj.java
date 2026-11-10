package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj b;

    public /* synthetic */ bj(dj djVar, int i7) {
        this.a = i7;
        this.b = djVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dj djVar = this.b;
                if (djVar.f != null) {
                    djVar.w = org.telegram.messenger.k5.i(new StringBuilder("+"), djVar.f.phone, pf.b.c());
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
