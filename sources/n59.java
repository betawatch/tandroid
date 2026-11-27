// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class n59 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new n59());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        z57 z57Var = (z57) view;
        z57Var.a((TLObject) b8cVar.H, b8cVar.A, true);
        z57Var.setOnClickListener(b8cVar.E);
    }

    @Override // a8c
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.C == b8cVar2.C;
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        z57 z57Var = new z57(context);
        z57Var.setBackground(aob.L0(false));
        return z57Var;
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.C == b8cVar2.C;
    }
}
