package ci;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class p9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ p9(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ia iaVar = this.b.W;
                org.telegram.ui.Components.pc.h(iaVar.container);
                super/*org.telegram.ui.ActionBar.f3*/.dismiss();
                break;
            case 1:
                ba baVar = this.b;
                baVar.v.setLoading(false);
                ia iaVar2 = baVar.W;
                iaVar2.f1();
                iaVar2.b.E(0);
                break;
            case 2:
                this.b.U = false;
                break;
            case 3:
                ia iaVar3 = this.b.W;
                iaVar3.M = 6;
                iaVar3.b.E(1);
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
