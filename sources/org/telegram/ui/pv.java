package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ LaunchActivity d;

    public /* synthetic */ pv(qy qyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = qyVar;
        this.c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qy.w0(this.b, this.c, this.d);
                break;
            default:
                qy.x0(this.b, this.c, this.d);
                break;
        }
    }
}
