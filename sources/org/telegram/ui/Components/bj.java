package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj b;

    public /* synthetic */ bj(dj djVar, int i10) {
        this.a = i10;
        this.b = djVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dj djVar = this.b;
                if (djVar.f != null) {
                    djVar.w = org.telegram.messenger.m5.h(new StringBuilder("+"), djVar.f.phone, af.b.c());
                    djVar.s = djVar.f;
                    org.telegram.messenger.i0.g3(new bj(djVar, 1));
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
