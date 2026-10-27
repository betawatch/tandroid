package di;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi.n9 b;

    public /* synthetic */ e4(fi.n9 n9Var, int i10) {
        this.a = i10;
        this.b = n9Var;
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
