package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ar implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ TLRPC.TL_chatFull c;

    public /* synthetic */ ar(hs hsVar, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.a = i10;
        this.b = hsVar;
        this.c = tL_chatFull;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.TL_chatFull tL_chatFull = this.c;
        hs hsVar = this.b;
        switch (i10) {
            case 0:
                zs notificationCenter = hsVar.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                break;
            default:
                zs notificationCenter2 = hsVar.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                break;
        }
    }
}
