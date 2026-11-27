// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
