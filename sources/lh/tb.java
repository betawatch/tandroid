package lh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class tb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cc b;

    public /* synthetic */ tb(cc ccVar, int i10) {
        this.a = i10;
        this.b = ccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cc ccVar = this.b;
                ac acVar = ccVar.I;
                if (acVar != null) {
                    long j10 = acVar.a;
                    if (j10 > 0) {
                        ccVar.D = j10;
                        break;
                    }
                }
                break;
            case 1:
                wb wbVar = this.b.a;
                if (wbVar != null) {
                    wbVar.Y1();
                    break;
                }
                break;
            default:
                wb wbVar2 = this.b.a;
                if (wbVar2 != null) {
                    wbVar2.g0();
                    break;
                }
                break;
        }
    }
}
