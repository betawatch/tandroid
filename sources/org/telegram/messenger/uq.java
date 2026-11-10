package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class uq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;
    public final /* synthetic */ TLRPC.TL_chatFull c;

    public /* synthetic */ uq(yr yrVar, TLRPC.TL_chatFull tL_chatFull, int i7) {
        this.a = i7;
        this.b = yrVar;
        this.c = tL_chatFull;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.TL_chatFull tL_chatFull = this.c;
        yr yrVar = this.b;
        switch (i7) {
            case 0:
                qs notificationCenter = yrVar.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                break;
            default:
                qs notificationCenter2 = yrVar.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                break;
        }
    }
}
