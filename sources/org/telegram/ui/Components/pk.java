package org.telegram.ui.Components;

import android.location.Location;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
