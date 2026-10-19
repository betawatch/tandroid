package org.telegram.messenger;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class gb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ gb(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
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
