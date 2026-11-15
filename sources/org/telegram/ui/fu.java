package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ LaunchActivity d;

    public /* synthetic */ fu(yw ywVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.a = i7;
        this.b = ywVar;
        this.c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yw.v0(this.b, this.c, this.d);
                break;
            default:
                yw.j0(this.b, this.c, this.d);
                break;
        }
    }
}
