// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mm1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ mu9 c;
    public final /* synthetic */ String d;

    public /* synthetic */ mm1(zu1 zu1Var, mu9 mu9Var, String str, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = mu9Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        mu9 mu9Var = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                mu9Var.dismiss();
                hl.g(str);
                d31.b0(zu1Var).i(ob6.M0(2131746062, null)).j();
                break;
            case 1:
                zu1Var.getClass();
                mu9Var.dismiss();
                hl.g(str);
                d31.b0(zu1Var).i(ob6.M0(2131742852, null)).j();
                break;
            case 2:
                mu9Var.dismiss();
                hl.g(str);
                d31.b0(zu1Var).i(ob6.M0(2131752534, null)).j();
                break;
            default:
                mu9Var.dismiss();
                hl.g("@".concat(str));
                d31.b0(zu1Var).i(ob6.M0(2131743320, null)).j();
                break;
        }
    }
}
