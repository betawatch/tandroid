// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dca extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new dca());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        Object obj = b8cVar.H;
        if (obj instanceof es8) {
            es8 es8Var = (es8) obj;
            ((fca) view).b(b8cVar.m, es8Var.d, es8Var.e, z);
        } else if (obj instanceof hc7) {
            ((fca) view).a(b8cVar.m, ((hc7) obj).b, true, z);
        }
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new fca(context);
    }
}
