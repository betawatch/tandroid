package oh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh.c8 b;

    public /* synthetic */ v3(qh.c8 c8Var, int i10) {
        this.a = i10;
        this.b = c8Var;
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
