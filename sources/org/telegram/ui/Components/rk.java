package org.telegram.ui.Components;

import android.location.Location;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rk implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl b;

    public /* synthetic */ rk(bl blVar, int i10) {
        this.a = i10;
        this.b = blVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                bl.N(this.b, (org.telegram.messenger.ha) obj);
                break;
            default:
                bl.T(this.b, (Location) obj);
                break;
        }
    }
}
