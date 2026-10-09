package ai;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class va implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wa b;

    public /* synthetic */ va(wa waVar, int i10) {
        this.a = i10;
        this.b = waVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xa xaVar = this.b.v;
                xaVar.s = 0;
                xaVar.requestLayout();
                ya yaVar = xaVar.J;
                yaVar.L(yaVar.getWidth(), yaVar.getHeight());
                yaVar.requestLayout();
                break;
            case 1:
                xa xaVar2 = this.b.v;
                xaVar2.s = 0;
                xaVar2.requestLayout();
                ya yaVar2 = xaVar2.J;
                yaVar2.L(yaVar2.getWidth(), yaVar2.getHeight());
                yaVar2.requestLayout();
                break;
            case 2:
                wa waVar = this.b;
                waVar.v.post(new va(waVar, 3));
                break;
            default:
                this.b.v.x = true;
                break;
        }
    }
}
