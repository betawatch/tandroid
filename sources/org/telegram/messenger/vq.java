package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class vq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr b;
    public final /* synthetic */ TLRPC.TL_chatFull c;

    public /* synthetic */ vq(tr trVar, TLRPC.TL_chatFull tL_chatFull, int i7) {
        this.a = i7;
        this.b = trVar;
        this.c = tL_chatFull;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.TL_chatFull tL_chatFull = this.c;
        tr trVar = this.b;
        switch (i7) {
            case 0:
                ks notificationCenter = trVar.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                break;
            default:
                ks notificationCenter2 = trVar.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                break;
        }
    }
}
