package org.telegram.ui.Components;

import android.location.Location;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pk implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk b;

    public /* synthetic */ pk(wk wkVar, int i7) {
        this.a = i7;
        this.b = wkVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                wk.Z(this.b, (org.telegram.messenger.fa) obj);
                break;
            default:
                wk.W(this.b, (Location) obj);
                break;
        }
    }
}
