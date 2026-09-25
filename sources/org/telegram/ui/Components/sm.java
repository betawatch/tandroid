package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
