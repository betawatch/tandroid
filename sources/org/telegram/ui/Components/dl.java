package org.telegram.ui.Components;

import android.location.Location;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl b;

    public /* synthetic */ dl(kl klVar, int i7) {
        this.a = i7;
        this.b = klVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                kl.Z(this.b, (org.telegram.messenger.da) obj);
                break;
            default:
                kl.X(this.b, (Location) obj);
                break;
        }
    }
}
