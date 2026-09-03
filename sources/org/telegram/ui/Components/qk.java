package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qk implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ al b;

    public /* synthetic */ qk(al alVar, int i10) {
        this.a = i10;
        this.b = alVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                al.J(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                al.R(this.b, (Location) obj);
                break;
        }
    }
}
