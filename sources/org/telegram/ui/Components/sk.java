package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sk implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl b;

    public /* synthetic */ sk(bl blVar, int i10) {
        this.a = i10;
        this.b = blVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                bl.J(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                bl.R(this.b, (Location) obj);
                break;
        }
    }
}
