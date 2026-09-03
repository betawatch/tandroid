package nh;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph.e8 b;

    public /* synthetic */ t3(ph.e8 e8Var, int i10) {
        this.a = i10;
        this.b = e8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                this.b.onBackPressed();
                break;
        }
    }
}
