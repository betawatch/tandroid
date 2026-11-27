// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class gpc implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c51 b;
    public final /* synthetic */ nx0 c;
    public final /* synthetic */ vnb d;

    public /* synthetic */ gpc(c51 c51Var, nx0 nx0Var, vnb vnbVar, byte b) {
        this.a = b;
        this.b = c51Var;
        this.c = nx0Var;
        this.d = vnbVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        vnb vnbVar = this.d;
        nx0 nx0Var = this.c;
        c51 c51Var = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                c51Var.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    new d31(nx0Var.F, vnbVar).f0(str, false);
                    break;
                } else {
                    nx0Var.dismiss();
                    break;
                }
            default:
                c51Var.setLoading(false);
                if (str == null) {
                    nx0Var.dismiss();
                    break;
                } else {
                    new d31(nx0Var.F, vnbVar).f0(str, false);
                    break;
                }
        }
    }
}
