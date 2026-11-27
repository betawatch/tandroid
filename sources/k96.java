// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class k96 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new k96());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((l96) view).set((n96) b8cVar.H);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new l96(context);
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.H == b8cVar2.H;
    }
}
