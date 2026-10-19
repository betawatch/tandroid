package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class we implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ we(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = callback;
        this.d = j10;
        this.e = j11;
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
