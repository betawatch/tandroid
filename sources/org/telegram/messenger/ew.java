package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class ew implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ az b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ ew(az azVar, TLRPC.Updates updates, int i7) {
        this.a = i7;
        this.b = azVar;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getMessagesController().V3(this.c, false);
                break;
            default:
                this.b.getMessagesController().V3(this.c, false);
                break;
        }
    }
}
