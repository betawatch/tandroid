package bi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class sa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb b;

    public /* synthetic */ sa(kb kbVar, int i10) {
        this.a = i10;
        this.b = kbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rb rbVar = this.b.W;
                org.telegram.ui.Components.pc.h(rbVar.container);
                super/*org.telegram.ui.ActionBar.h3*/.dismiss();
                break;
            case 1:
                kb kbVar = this.b;
                kbVar.v.setLoading(false);
                rb rbVar2 = kbVar.W;
                rbVar2.f1();
                rbVar2.b.D(0);
                break;
            case 2:
                this.b.U = false;
                break;
            case 3:
                rb rbVar3 = this.b.W;
                rbVar3.M = 6;
                rbVar3.b.D(1);
                break;
            case 4:
                kb kbVar2 = this.b;
                kbVar2.n.m(2);
                kbVar2.f.forceLayout();
                kbVar2.j();
                break;
            default:
                kb kbVar3 = this.b;
                rb rbVar4 = kbVar3.W;
                if (kbVar3.a != 0) {
                    rbVar4.onBackPressed();
                    break;
                } else {
                    rbVar4.dismiss();
                    break;
                }
        }
    }
}
