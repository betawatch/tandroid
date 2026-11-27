// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class hr0 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new hr0());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ir0 ir0Var = (ir0) view;
        t4c t4cVar = (t4c) b8cVar.H;
        ir0Var.a.setText(t4cVar.b);
        ir0Var.b.setText(t4cVar.c);
        if (ir0Var.c != z) {
            ir0Var.invalidate();
        }
        ir0Var.c = z;
        ir0Var.setWillNotDraw(!z);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new ir0(context);
    }
}
