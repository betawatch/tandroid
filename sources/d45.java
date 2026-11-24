// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class d45 implements qac {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ b61 b;
    public final /* synthetic */ b61 c;
    public final /* synthetic */ mk7 d;
    public final /* synthetic */ ylb e;
    public final /* synthetic */ s45 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ d45(b61 b61Var, b61 b61Var2, w45 w45Var, s45 s45Var, mk7 mk7Var, ylb ylbVar, if4 if4Var) {
        this.b = b61Var;
        this.c = b61Var2;
        this.g = w45Var;
        this.f = s45Var;
        this.d = mk7Var;
        this.e = ylbVar;
        this.h = if4Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                w45 w45Var = (w45) obj3;
                if4 if4Var = (if4) obj2;
                Boolean bool = (Boolean) obj;
                b61 b61Var = this.b;
                b61Var.setEnabled(false);
                b61 b61Var2 = this.c;
                b61Var2.setEnabled(false);
                (bool.booleanValue() ? b61Var2 : b61Var).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                mk7 mk7Var = this.d;
                ylb ylbVar = this.e;
                s45 s45Var = this.f;
                w45Var.e(s45Var, booleanValue, new f45(b61Var, b61Var2, mk7Var, ylbVar, if4Var, s45Var, (byte) 0));
                break;
            default:
                boolean[] zArr = (boolean[]) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                String str = (String) obj;
                b61 b61Var3 = this.b;
                b61Var3.setLoading(false);
                b61 b61Var4 = this.c;
                b61Var4.setLoading(false);
                mk7 mk7Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        c41.d0(str, mk7Var2.F, this.e);
                        s45 s45Var2 = this.f;
                        b61Var3.setEnabled(!s45Var2.n && zArr2[0]);
                        if (!s45Var2.n && !s45Var2.o) {
                            z = true;
                        }
                        b61Var4.setEnabled(z);
                        break;
                    } else {
                        c41.c0(str);
                        break;
                    }
                } else {
                    mk7Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d45(b61 b61Var, b61 b61Var2, mk7 mk7Var, boolean[] zArr, ylb ylbVar, s45 s45Var, boolean[] zArr2) {
        this.b = b61Var;
        this.c = b61Var2;
        this.d = mk7Var;
        this.g = zArr;
        this.e = ylbVar;
        this.f = s45Var;
        this.h = zArr2;
    }
}
