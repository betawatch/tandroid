// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
