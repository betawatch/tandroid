package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ ue(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
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
                this.b.lambda$getEphemeralMessages$212(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$getEphemeralMessages$211(this.c, this.d, this.e);
                break;
        }
    }
}
