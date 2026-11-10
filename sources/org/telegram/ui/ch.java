package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ cn b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.User e;

    public /* synthetic */ ch(cn cnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.b = cnVar;
        this.c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cn.j0(this.b, this.c, this.d, this.e);
                break;
            default:
                cn.x0(this.b, this.c, this.d, this.e);
                break;
        }
    }

    public /* synthetic */ ch(cn cnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = cnVar;
        this.d = tL_error;
        this.c = tL_attachMenuBot;
        this.e = user;
    }
}
