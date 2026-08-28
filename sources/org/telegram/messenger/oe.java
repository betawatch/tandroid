package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class oe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage.IntCallback b;
    public final /* synthetic */ int c;

    public /* synthetic */ oe(MessagesStorage.IntCallback intCallback, int i9, int i10) {
        this.a = i10;
        this.b = intCallback;
        this.c = i9;
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
