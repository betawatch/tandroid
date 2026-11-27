// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class gq9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ gq9(int[] iArr, Runnable runnable, byte b) {
        this.a = b;
        this.b = iArr;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        Runnable runnable = this.c;
        int[] iArr = this.b;
        switch (b) {
            case 0:
                hl.c3(new gq9(iArr, runnable, b2));
                break;
            default:
                int i = iArr[0] - 1;
                iArr[0] = i;
                if (i == 0 && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
