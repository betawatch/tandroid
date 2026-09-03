package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class xe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage.IntCallback b;
    public final /* synthetic */ int c;

    public /* synthetic */ xe(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.a = i11;
        this.b = intCallback;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run(this.c);
                break;
            case 1:
                this.b.run(this.c);
                break;
            default:
                this.b.run(this.c);
                break;
        }
    }
}
