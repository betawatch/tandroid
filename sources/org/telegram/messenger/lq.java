package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class lq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;
    public final /* synthetic */ TLRPC.TL_chatFull c;

    public /* synthetic */ lq(qr qrVar, TLRPC.TL_chatFull tL_chatFull, int i3) {
        this.a = i3;
        this.b = qrVar;
        this.c = tL_chatFull;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        TLRPC.TL_chatFull tL_chatFull = this.c;
        qr qrVar = this.b;
        switch (i3) {
            case 0:
                hs notificationCenter = qrVar.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                break;
            default:
                hs notificationCenter2 = qrVar.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                break;
        }
    }
}
