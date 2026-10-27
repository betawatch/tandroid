package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class kf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ kf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getDialogs$243(this.c);
                break;
            case 1:
                this.b.lambda$markMessagesAsDeletedInternal$229(this.c);
                break;
            case 2:
                this.b.lambda$deleteEphemeralMessages$209(this.c);
                break;
            default:
                this.b.lambda$putWebPages$192(this.c);
                break;
        }
    }
}
