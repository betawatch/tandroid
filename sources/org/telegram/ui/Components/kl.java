package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ tl b;

    public /* synthetic */ kl(tl tlVar, int i10) {
        this.a = i10;
        this.b = tlVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                tl.N(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                tl.U(this.b, (Location) obj);
                break;
        }
    }
}
