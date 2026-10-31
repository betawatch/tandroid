package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ LaunchActivity d;

    public /* synthetic */ gv(ay ayVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = ayVar;
        this.c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ay.u0(this.b, this.c, this.d);
                break;
            default:
                ay.i0(this.b, this.c, this.d);
                break;
        }
    }
}
