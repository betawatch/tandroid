package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
