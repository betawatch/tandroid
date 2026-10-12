package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ul b;

    public /* synthetic */ ll(ul ulVar, int i10) {
        this.a = i10;
        this.b = ulVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ul.N(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                ul.U(this.b, (Location) obj);
                break;
        }
    }
}
