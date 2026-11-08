package org.telegram.ui.Components;

import android.location.Location;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pk implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk b;

    public /* synthetic */ pk(wk wkVar, int i7) {
        this.a = i7;
        this.b = wkVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                wk.Z(this.b, (org.telegram.messenger.fa) obj);
                break;
            default:
                wk.W(this.b, (Location) obj);
                break;
        }
    }
}
