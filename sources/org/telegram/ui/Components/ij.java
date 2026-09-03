package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ij implements oj {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ ij(int i10, TLRPC.User user) {
        this.a = i10;
        this.b = user;
    }

    @Override // org.telegram.ui.Components.oj
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
