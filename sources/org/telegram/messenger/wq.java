package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class wq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;
    public final /* synthetic */ TLRPC.TL_chatFull c;

    public /* synthetic */ wq(ur urVar, TLRPC.TL_chatFull tL_chatFull, int i7) {
        this.a = i7;
        this.b = urVar;
        this.c = tL_chatFull;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.TL_chatFull tL_chatFull = this.c;
        ur urVar = this.b;
        switch (i7) {
            case 0:
                ls notificationCenter = urVar.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                break;
            default:
                ls notificationCenter2 = urVar.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                break;
        }
    }
}
