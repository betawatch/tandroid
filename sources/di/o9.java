package di;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class o9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ o9(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ia iaVar = this.b.W;
                org.telegram.ui.Components.qc.h(iaVar.container);
                super/*org.telegram.ui.ActionBar.f3*/.dismiss();
                break;
            case 1:
                ba baVar = this.b;
                baVar.v.setLoading(false);
                ia iaVar2 = baVar.W;
                iaVar2.f1();
                iaVar2.b.D(0);
                break;
            case 2:
                this.b.U = false;
                break;
            case 3:
                ia iaVar3 = this.b.W;
                iaVar3.M = 6;
                iaVar3.b.D(1);
                break;
            case 4:
                ba baVar2 = this.b;
                baVar2.n.m(2);
                baVar2.f.forceLayout();
                baVar2.j();
                break;
            default:
                ba baVar3 = this.b;
                ia iaVar4 = baVar3.W;
                if (baVar3.a != 0) {
                    iaVar4.onBackPressed();
                    break;
                } else {
                    iaVar4.dismiss();
                    break;
                }
        }
    }
}
