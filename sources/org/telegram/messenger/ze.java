package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class ze implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ ze(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = callback;
        this.d = j3;
        this.e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getEphemeralMessages$208(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$getEphemeralMessages$207(this.c, this.d, this.e);
                break;
        }
    }
}
