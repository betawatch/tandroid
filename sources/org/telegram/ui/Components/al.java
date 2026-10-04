package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
