package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ af(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
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
