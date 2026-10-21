package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class il implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ rl b;

    public /* synthetic */ il(rl rlVar, int i10) {
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
                rl.U(this.b, (Location) obj);
                break;
        }
    }
}
