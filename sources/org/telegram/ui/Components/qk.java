package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
