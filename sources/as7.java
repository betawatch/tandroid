// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class as7 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ylb d;
    public final /* synthetic */ pr7 e;
    public final /* synthetic */ Boolean f;

    public /* synthetic */ as7(Context context, int i, ylb ylbVar, pr7 pr7Var, Boolean bool, byte b) {
        this.a = b;
        this.b = context;
        this.c = i;
        this.d = ylbVar;
        this.e = pr7Var;
        this.f = bool;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        pr7 pr7Var = this.e;
        switch (b) {
            case 0:
                c41 j = pr7Var.j();
                fs7.q(this.b, this.c, this.d, j, (String) obj, this.f);
                break;
            case 1:
                c41 j2 = pr7Var.j();
                fs7.q(this.b, this.c, this.d, j2, (String) obj, this.f);
                break;
            case 2:
                c41 j3 = pr7Var.j();
                fs7.q(this.b, this.c, this.d, j3, (String) obj, this.f);
                break;
            default:
                c41 j4 = pr7Var.j();
                fs7.q(this.b, this.c, this.d, j4, (String) obj, this.f);
                break;
        }
    }
}
