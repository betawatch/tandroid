// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class lt8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ au8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ lt8(au8 au8Var, int i, byte b) {
        this.a = b;
        this.b = au8Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        au8 au8Var = this.b;
        switch (b) {
            case 0:
                au8Var.f.scrollBy(0, i);
                break;
            default:
                wa waVar = au8Var.f;
                if (waVar != null) {
                    waVar.setSpanCount(i);
                    break;
                }
                break;
        }
    }
}
