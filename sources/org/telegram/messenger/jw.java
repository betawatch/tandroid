package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class jw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ jw(gz gzVar, TLRPC.Updates updates, int i7) {
        this.a = i7;
        this.b = gzVar;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getMessagesController().O3(this.c, false);
                break;
            default:
                this.b.getMessagesController().O3(this.c, false);
                break;
        }
    }
}
