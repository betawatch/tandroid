package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
