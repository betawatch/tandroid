package bi;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class ba implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;

    public /* synthetic */ ba(ca caVar, int i10) {
        this.a = i10;
        this.b = caVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                da daVar = this.b.v;
                daVar.s = 0;
                daVar.requestLayout();
                ea eaVar = daVar.J;
                eaVar.L(eaVar.getWidth(), eaVar.getHeight());
                eaVar.requestLayout();
                break;
            case 1:
                da daVar2 = this.b.v;
                daVar2.s = 0;
                daVar2.requestLayout();
                ea eaVar2 = daVar2.J;
                eaVar2.L(eaVar2.getWidth(), eaVar2.getHeight());
                eaVar2.requestLayout();
                break;
            case 2:
                ca caVar = this.b;
                caVar.v.post(new ba(caVar, 3));
                break;
            default:
                this.b.v.x = true;
                break;
        }
    }
}
