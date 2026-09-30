package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ il b;

    public /* synthetic */ zk(il ilVar, int i10) {
        this.a = i10;
        this.b = ilVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                il.K(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                il.R(this.b, (Location) obj);
                break;
        }
    }
}
