package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class du implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ LaunchActivity d;

    public /* synthetic */ du(ww wwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i7) {
        this.a = i7;
        this.b = wwVar;
        this.c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ww.v0(this.b, this.c, this.d);
                break;
            default:
                ww.j0(this.b, this.c, this.d);
                break;
        }
    }
}
