package ai;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ ua(va vaVar, int i10) {
        this.a = i10;
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wa waVar = this.b.v;
                waVar.s = 0;
                waVar.requestLayout();
                xa xaVar = waVar.J;
                xaVar.L(xaVar.getWidth(), xaVar.getHeight());
                xaVar.requestLayout();
                break;
            case 1:
                wa waVar2 = this.b.v;
                waVar2.s = 0;
                waVar2.requestLayout();
                xa xaVar2 = waVar2.J;
                xaVar2.L(xaVar2.getWidth(), xaVar2.getHeight());
                xaVar2.requestLayout();
                break;
            case 2:
                va vaVar = this.b;
                vaVar.v.post(new ua(vaVar, 3));
                break;
            default:
                this.b.v.x = true;
                break;
        }
    }
}
