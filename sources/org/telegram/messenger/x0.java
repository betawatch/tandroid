package org.telegram.messenger;

import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatObject.Call b;

    public /* synthetic */ x0(ChatObject.Call call, int i10) {
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
