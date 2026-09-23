package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl b;

    public /* synthetic */ yk(hl hlVar, int i10) {
        this.a = i10;
        this.b = hlVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                hl.K(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                hl.R(this.b, (Location) obj);
                break;
        }
    }
}
