package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uj implements zj {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ uj(int i10, TLRPC.User user) {
        this.a = i10;
        this.b = user;
    }

    @Override // org.telegram.ui.Components.zj
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
        return org.telegram.messenger.bi.g(sb2, str, c10);
    }
}
