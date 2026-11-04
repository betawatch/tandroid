package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class cw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ cw(yy yyVar, TLRPC.Updates updates, int i3) {
        this.a = i3;
        this.b = yyVar;
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
