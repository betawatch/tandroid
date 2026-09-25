package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj implements xj {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ sj(int i10, TLRPC.User user) {
        this.a = i10;
        this.b = user;
    }

    @Override // org.telegram.ui.Components.xj
    public final String run() {
        gf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.a) {
            case 0:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.b.phone;
                break;
            default:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.b.phone;
                break;
        }
        return org.telegram.messenger.ok.h(sb2, str, c10);
    }
}
