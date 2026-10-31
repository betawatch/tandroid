package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ un b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLRPC.TL_attachMenuBot d;
    public final /* synthetic */ TLRPC.User e;

    public /* synthetic */ ph(un unVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.b = unVar;
        this.d = tL_attachMenuBot;
        this.c = tL_error;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un.s1(this.b, this.d, this.c, this.e);
                break;
            default:
                un.o1(this.b, this.d, this.c, this.e);
                break;
        }
    }

    public /* synthetic */ ph(un unVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = unVar;
        this.c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}
