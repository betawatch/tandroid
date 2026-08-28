package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ ue(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i9) {
        this.a = i9;
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
