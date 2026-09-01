package org.telegram.messenger;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ig implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ig(MessagesStorage messagesStorage, int i10, boolean z4, long j10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j10;
        this.d = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$setDialogUnread$248(this.c, this.d);
                break;
            default:
                this.b.lambda$setDialogViewThreadAsMessages$249(this.c, this.d);
                break;
        }
    }
}
