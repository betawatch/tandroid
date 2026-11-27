// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class d3a extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new d3a());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        e3a e3aVar = (e3a) view;
        e3aVar.setUser((TLRPC.User) b8cVar.H);
        e3aVar.c(b8cVar.e, false);
        e3aVar.setDivider(z);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new e3a(context, true, false, vnbVar, false);
    }
}
