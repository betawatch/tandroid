package org.telegram.messenger;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class jf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ jf(MessagesStorage messagesStorage, boolean z10, int i10) {
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
