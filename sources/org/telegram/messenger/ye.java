package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ye implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ ye(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
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
