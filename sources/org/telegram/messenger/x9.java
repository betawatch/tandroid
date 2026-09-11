package org.telegram.messenger;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class x9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ x9(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.a = i13;
        this.b = messagesController;
        this.c = j3;
        this.d = i10;
        this.e = z10;
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
