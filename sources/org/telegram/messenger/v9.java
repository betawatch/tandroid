package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class v9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ v9(MessagesController messagesController, long j10, int i9, boolean z10, int i10, int i11, int i12) {
        this.a = i12;
        this.b = messagesController;
        this.c = j10;
        this.d = i9;
        this.e = z10;
        this.f = i10;
        this.h = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i9 = this.f;
                int i10 = this.h;
                int i11 = this.d;
                this.b.lambda$markDialogAsRead$243(this.c, i11, this.e, i9, i10);
                break;
            default:
                int i12 = this.f;
                int i13 = this.h;
                int i14 = this.d;
                this.b.lambda$markDialogAsRead$244(this.c, i14, this.e, i12, i13);
                break;
        }
    }
}
