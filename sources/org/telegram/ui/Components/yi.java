package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yi implements dj {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ yi(int i7, TLRPC.User user) {
        this.a = i7;
        this.b = user;
    }

    @Override // org.telegram.ui.Components.dj
    public final String run() {
        pf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.a) {
            case 0:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.b.phone;
                break;
            default:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.b.phone;
                break;
        }
        return org.telegram.messenger.k5.i(sb2, str, c10);
    }
}
