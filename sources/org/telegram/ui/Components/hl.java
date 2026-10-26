package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
