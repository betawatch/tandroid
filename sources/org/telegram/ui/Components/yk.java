package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl b;

    public /* synthetic */ yk(hl hlVar, int i10) {
        this.a = i10;
        this.b = hlVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                hl.K(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                hl.R(this.b, (Location) obj);
                break;
        }
    }
}
