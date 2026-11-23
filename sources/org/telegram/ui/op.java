package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class op implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rq b;

    public /* synthetic */ op(rq rqVar, int i7) {
        this.a = i7;
        this.b = rqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.w0();
                break;
            default:
                rq rqVar = this.b;
                rqVar.getMessagesController().b3(0, rqVar.N, true);
                break;
        }
    }
}
