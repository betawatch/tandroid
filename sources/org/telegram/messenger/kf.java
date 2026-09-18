package org.telegram.messenger;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class kf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ kf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getCachedPhoneBook$150(this.c);
                break;
            default:
                this.b.lambda$cleanup$6(this.c);
                break;
        }
    }
}
