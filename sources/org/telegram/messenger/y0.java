package org.telegram.messenger;

import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatObject.Call b;

    public /* synthetic */ y0(ChatObject.Call call, int i10) {
        this.a = i10;
        this.b = call;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$new$0();
                break;
            case 1:
                this.b.checkQueue();
                break;
            default:
                this.b.lambda$createRtmpStreamParticipant$1();
                break;
        }
    }
}
