package di;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
