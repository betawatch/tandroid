package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll b;

    public /* synthetic */ cl(ll llVar, int i10) {
        this.a = i10;
        this.b = llVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ll.K(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                ll.R(this.b, (Location) obj);
                break;
        }
    }
}
