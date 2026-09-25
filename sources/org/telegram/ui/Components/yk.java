package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
