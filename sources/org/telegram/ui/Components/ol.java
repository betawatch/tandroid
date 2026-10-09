package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ol implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ xl b;

    public /* synthetic */ ol(xl xlVar, int i10) {
        this.a = i10;
        this.b = xlVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                xl.N(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                xl.U(this.b, (Location) obj);
                break;
        }
    }
}
