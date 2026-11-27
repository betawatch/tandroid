// default package

import android.content.Context;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class fb9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ vnb d;
    public final /* synthetic */ en9 e;

    public /* synthetic */ fb9(e eVar, Context context, vnb vnbVar, en9 en9Var, byte b) {
        this.a = b;
        this.b = eVar;
        this.c = context;
        this.d = vnbVar;
        this.e = en9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        en9 en9Var = this.e;
        vnb vnbVar = this.d;
        Context context = this.c;
        e eVar = this.b;
        switch (b) {
            case 0:
                d31.b0(eVar).c(hl.N2(ob6.M0(2131754480, null), -1, 2, new xf1(context, (byte) 11), vnbVar)).j();
                hl.c3(en9Var);
                break;
            case 1:
                d31.b0(eVar).c(hl.N2(ob6.M0(2131754480, null), -1, 2, new xf1(context, (byte) 9), vnbVar)).j();
                hl.c3(en9Var);
                break;
            default:
                d31.b0(eVar).c(hl.N2(ob6.M0(2131754480, null), -1, 2, new xf1(context, (byte) 14), vnbVar)).j();
                hl.c3(en9Var);
                break;
        }
    }
}
