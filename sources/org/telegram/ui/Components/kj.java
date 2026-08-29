package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kj implements qj {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ kj(int i10, TLRPC.User user) {
        this.a = i10;
        this.b = user;
    }

    @Override // org.telegram.ui.Components.qj
    public final String run() {
        qe.b c3;
        StringBuilder sb2;
        String str;
        switch (this.a) {
            case 0:
                c3 = qe.b.c();
                sb2 = new StringBuilder("+");
                str = this.b.phone;
                break;
            default:
                c3 = qe.b.c();
                sb2 = new StringBuilder("+");
                str = this.b.phone;
                break;
        }
        return org.telegram.messenger.x3.k(sb2, str, c3);
    }
}
