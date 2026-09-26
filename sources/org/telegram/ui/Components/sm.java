package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ vn b;
    public final /* synthetic */ int c;

    public /* synthetic */ sm(vn vnVar, int i10, int i11) {
        this.a = i11;
        this.b = vnVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, (qh.e) obj);
                break;
            default:
                vn vnVar = this.b;
                vnVar.getClass();
                vnVar.e0(this.c, new rh.e((String) obj));
                break;
        }
    }
}
