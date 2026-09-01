package org.telegram.messenger;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ca implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ ca(MessagesController messagesController, long j10, int i10, boolean z4, int i11, int i12, int i13) {
        this.a = i13;
        this.b = messagesController;
        this.c = j10;
        this.d = i10;
        this.e = z4;
        this.f = i11;
        this.h = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.f;
                int i11 = this.h;
                int i12 = this.d;
                this.b.lambda$markDialogAsRead$243(this.c, i12, this.e, i10, i11);
                break;
            default:
                int i13 = this.f;
                int i14 = this.h;
                int i15 = this.d;
                this.b.lambda$markDialogAsRead$244(this.c, i15, this.e, i13, i14);
                break;
        }
    }
}
