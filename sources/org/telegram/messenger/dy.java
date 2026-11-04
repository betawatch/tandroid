package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class dy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ TLRPC.Message d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ dy(yy yyVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i3) {
        this.a = i3;
        this.b = yyVar;
        this.c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yy yyVar = this.b;
                yyVar.getMessagesController().O3(this.c, false);
                g0.h3(new lw(yyVar, this.d, this.e, 0));
                break;
            default:
                yy yyVar2 = this.b;
                yyVar2.getMessagesController().O3(this.c, false);
                g0.h3(new lw(yyVar2, this.d, this.e, 1));
                break;
        }
    }
}
