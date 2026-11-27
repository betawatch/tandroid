// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class mqc extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new mqc());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((nqc) view).a(b8cVar.k, b8cVar.m, b8cVar.n);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new nqc(context, vnbVar);
    }

    @Override // a8c
    public final boolean f() {
        return false;
    }

    @Override // a8c
    public final boolean g() {
        return true;
    }
}
