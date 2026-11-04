package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi implements cj {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ xi(int i3, TLRPC.User user) {
        this.a = i3;
        this.b = user;
    }

    @Override // org.telegram.ui.Components.cj
    public final String run() {
        mf.b c2;
        StringBuilder sb2;
        String str;
        switch (this.a) {
            case 0:
                c2 = mf.b.c();
                sb2 = new StringBuilder("+");
                str = this.b.phone;
                break;
            default:
                c2 = mf.b.c();
                sb2 = new StringBuilder("+");
                str = this.b.phone;
                break;
        }
        return org.telegram.messenger.k5.i(sb2, str, c2);
    }
}
