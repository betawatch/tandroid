package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class fj implements kj {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ fj(int i7, TLRPC.User user) {
        this.a = i7;
        this.b = user;
    }

    @Override // org.telegram.ui.Components.kj
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
        return org.telegram.messenger.k5.h(sb2, str, c10);
    }
}
