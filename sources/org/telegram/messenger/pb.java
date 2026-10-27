package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class pb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ pb(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.a = i13;
        this.b = messagesController;
        this.c = j10;
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
                this.b.lambda$markDialogAsRead$242(this.c, i12, this.e, i10, i11);
                break;
            default:
                int i13 = this.f;
                int i14 = this.h;
                int i15 = this.d;
                this.b.lambda$markDialogAsRead$243(this.c, i15, this.e, i13, i14);
                break;
        }
    }
}
