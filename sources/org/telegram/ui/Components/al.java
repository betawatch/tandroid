package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class al implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl b;

    public /* synthetic */ al(jl jlVar, int i10) {
        this.a = i10;
        this.b = jlVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                jl.I(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                jl.P(this.b, (Location) obj);
                break;
        }
    }
}
