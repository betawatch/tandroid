// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class g96 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new g96());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((h96) view).set((m96) b8cVar.H);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        h96 h96Var = new h96(i, context, false);
        h96Var.setLayoutParams(new r79(-2, -2));
        return h96Var;
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.H == b8cVar2.H;
    }
}
