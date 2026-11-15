package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class xq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;
    public final /* synthetic */ TLRPC.TL_chatFull c;

    public /* synthetic */ xq(vr vrVar, TLRPC.TL_chatFull tL_chatFull, int i7) {
        this.a = i7;
        this.b = vrVar;
        this.c = tL_chatFull;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.TL_chatFull tL_chatFull = this.c;
        vr vrVar = this.b;
        switch (i7) {
            case 0:
                ns notificationCenter = vrVar.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                break;
            default:
                ns notificationCenter2 = vrVar.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                break;
        }
    }
}
