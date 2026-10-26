package fi;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ac acVar = ccVar.M;
                if (acVar != null) {
                    long j10 = acVar.a;
                    if (j10 > 0) {
                        ccVar.H = j10;
                        break;
                    }
                }
                break;
            case 1:
                wb wbVar = this.b.a;
                if (wbVar != null) {
                    wbVar.I();
                    break;
                }
                break;
            default:
                wb wbVar2 = this.b.a;
                if (wbVar2 != null) {
                    wbVar2.m();
                    break;
                }
                break;
        }
    }
}
