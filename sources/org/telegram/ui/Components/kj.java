package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        se.b c3;
        StringBuilder sb;
        String str;
        switch (this.a) {
            case 0:
                c3 = se.b.c();
                sb = new StringBuilder("+");
                str = this.b.phone;
                break;
            default:
                c3 = se.b.c();
                sb = new StringBuilder("+");
                str = this.b.phone;
                break;
        }
        return org.telegram.messenger.y3.j(sb, str, c3);
    }
}
