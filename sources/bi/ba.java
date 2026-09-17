package bi;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
