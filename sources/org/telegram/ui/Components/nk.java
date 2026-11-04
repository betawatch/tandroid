package org.telegram.ui.Components;

import android.location.Location;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nk implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ uk b;

    public /* synthetic */ nk(uk ukVar, int i3) {
        this.a = i3;
        this.b = ukVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                uk.Z(this.b, (org.telegram.messenger.z9) obj);
                break;
            default:
                uk.W(this.b, (Location) obj);
                break;
        }
    }
}
