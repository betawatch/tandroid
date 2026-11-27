// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cca extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new cca());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        Object obj = b8cVar.H;
        if (obj instanceof es8) {
            es8 es8Var = (es8) obj;
            ((eca) view).b(b8cVar.m, es8Var.d, es8Var.e, z);
        } else if (obj instanceof hc7) {
            ((eca) view).a(b8cVar.m, ((hc7) obj).b, true, z);
        }
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new eca(context);
    }
}
