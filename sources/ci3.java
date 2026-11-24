// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ci3 implements we7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk3 b;

    public /* synthetic */ ci3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override // we7
    public final void a(int i) {
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                nk3Var.W1 = i != 0;
                oc7.e1().edit().putBoolean("askAboutContacts", nk3Var.W1).commit();
                nk3Var.C2(false);
                break;
            default:
                nk3Var.W1 = i != 0;
                oc7.e1().edit().putBoolean("askAboutContacts", nk3Var.W1).apply();
                nk3Var.C2(false);
                break;
        }
    }
}
