package org.telegram.messenger;

import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatObject.Call b;

    public /* synthetic */ u0(ChatObject.Call call, int i10) {
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
