// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class jo2 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new jo2());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        long j = b8cVar.C;
        ((ko2) view).a((int) j, (int) (j >>> 32), b8cVar.k, b8cVar.m, b8cVar.o, b8cVar.r);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new ko2(vnbVar, context, false);
    }
}
