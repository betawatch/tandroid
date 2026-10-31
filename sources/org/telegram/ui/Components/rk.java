package org.telegram.ui.Components;

import android.location.Location;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                bl.N(this.b, (org.telegram.messenger.ga) obj);
                break;
            default:
                bl.T(this.b, (Location) obj);
                break;
        }
    }
}
