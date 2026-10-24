package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ rl b;

    public /* synthetic */ hl(rl rlVar, int i10) {
        this.a = i10;
        this.b = rlVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                rl.N(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                rl.T(this.b, (Location) obj);
                break;
        }
    }
}
