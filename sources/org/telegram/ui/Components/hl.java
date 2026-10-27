package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ sl b;

    public /* synthetic */ hl(sl slVar, int i10) {
        this.a = i10;
        this.b = slVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                sl.N(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                sl.T(this.b, (Location) obj);
                break;
        }
    }
}
