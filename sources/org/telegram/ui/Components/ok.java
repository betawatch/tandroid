package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ok implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ xk b;

    public /* synthetic */ ok(xk xkVar, int i9) {
        this.a = i9;
        this.b = xkVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                xk.J(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                xk.Q(this.b, (Location) obj);
                break;
        }
    }
}
