package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi implements cj {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ xi(int i10, TLRPC.User user) {
        this.a = i10;
        this.b = user;
    }

    @Override // org.telegram.ui.Components.cj
    public final String run() {
        af.b c10;
        StringBuilder sb2;
        String str;
        switch (this.a) {
            case 0:
                c10 = af.b.c();
                sb2 = new StringBuilder("+");
                str = this.b.phone;
                break;
            default:
                c10 = af.b.c();
                sb2 = new StringBuilder("+");
                str = this.b.phone;
                break;
        }
        return org.telegram.messenger.m5.h(sb2, str, c10);
    }
}
