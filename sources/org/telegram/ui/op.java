package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
