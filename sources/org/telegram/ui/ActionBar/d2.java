package org.telegram.ui.ActionBar;

import org.telegram.messenger.j20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.j20
    public final Object run() {
        switch (this.a) {
            case 0:
                return ((k2) this.b).getSimpleMenuOverlay();
            default:
                return ((rh.e4) this.b).k();
        }
    }
}
