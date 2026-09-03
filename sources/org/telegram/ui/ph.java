package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xn b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLRPC.TL_attachMenuBot d;
    public final /* synthetic */ TLRPC.User e;

    public /* synthetic */ ph(xn xnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.b = xnVar;
        this.d = tL_attachMenuBot;
        this.c = tL_error;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xn.w1(this.b, this.d, this.c, this.e);
                break;
            default:
                xn.W(this.b, this.d, this.c, this.e);
                break;
        }
    }

    public /* synthetic */ ph(xn xnVar, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = xnVar;
        this.c = tL_error;
        this.d = tL_attachMenuBot;
        this.e = user;
    }
}
