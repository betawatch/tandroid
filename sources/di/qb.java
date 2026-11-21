package di;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mc b;

    public /* synthetic */ qb(mc mcVar, int i7) {
        this.a = i7;
        this.b = mcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mc mcVar = this.b;
                mcVar.O1 = true;
                mcVar.K0(null);
                org.telegram.messenger.g0.h3(new qb(mcVar, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                wb wbVar = this.b.t1;
                wbVar.G = false;
                wbVar.invalidate();
                break;
        }
    }
}
