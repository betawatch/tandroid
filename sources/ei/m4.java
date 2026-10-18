package ei;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ rg.b2 c;

    public /* synthetic */ m4(f6 f6Var, rg.b2 b2Var, int i10) {
        this.a = i10;
        this.b = f6Var;
        this.c = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C0(this.c, true);
                break;
            default:
                this.b.B0(this.c);
                break;
        }
    }
}
