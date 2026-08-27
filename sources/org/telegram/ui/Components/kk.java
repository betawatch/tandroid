package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kk implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ tk b;

    public /* synthetic */ kk(tk tkVar, int i10) {
        this.a = i10;
        this.b = tkVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                tk.K(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                tk.R(this.b, (Location) obj);
                break;
        }
    }
}
