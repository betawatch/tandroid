package org.telegram.messenger;

import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatObject.Call b;

    public /* synthetic */ t0(ChatObject.Call call, int i10) {
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
