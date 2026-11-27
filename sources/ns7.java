// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ns7 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ vnb d;
    public final /* synthetic */ ms7 e;

    public /* synthetic */ ns7(Context context, int i, vnb vnbVar, ms7 ms7Var, byte b) {
        this.a = b;
        this.b = context;
        this.c = i;
        this.d = vnbVar;
        this.e = ms7Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        ms7 ms7Var = this.e;
        switch (b) {
            case 0:
                d31 j = ms7Var.j();
                it7.t(this.b, this.c, this.d, j, (String) obj, null);
                break;
            default:
                d31 j2 = ms7Var.j();
                it7.t(this.b, this.c, this.d, j2, (String) obj, null);
                break;
        }
    }
}
