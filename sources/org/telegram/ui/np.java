package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class np implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qq b;

    public /* synthetic */ np(qq qqVar, int i7) {
        this.a = i7;
        this.b = qqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.w0();
                break;
            default:
                qq qqVar = this.b;
                qqVar.getMessagesController().V2(0, qqVar.N, true);
                break;
        }
    }
}
