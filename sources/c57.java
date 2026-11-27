// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m57 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ c57(m57 m57Var, Context context, byte b) {
        this.a = b;
        this.b = m57Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Context context = this.c;
        m57 m57Var = this.b;
        switch (b) {
            case 0:
                m57Var.d0.a(false);
                hl.c3(new c57(m57Var, context, (byte) 1));
                break;
            default:
                if (hl.C1(context)) {
                    new xk8(43, m57Var.d0.G, context).show();
                    break;
                }
                break;
        }
    }
}
