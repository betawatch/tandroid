// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class f1c extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new f1c());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        g1c g1cVar = (g1c) view;
        boolean z2 = false;
        if (b8cVar.s) {
            g1cVar.f();
        } else {
            Object obj = b8cVar.H;
            if (obj == null) {
                if (b8cVar.d == -2) {
                    g1cVar.c();
                } else {
                    g1cVar.d((b8cVar.z & 1) != 0, b8cVar.r, b8cVar.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                boolean z3 = b8cVar.J;
                long j = b8cVar.y;
                if (z3) {
                    g1cVar.b(j, (TLRPC.TL_forumTopic) obj, b8cVar.e);
                } else {
                    g1cVar.g(j, (TLRPC.TL_forumTopic) obj, b8cVar.e);
                }
            }
        }
        g1cVar.M = vsd.a(b8cVar.z, 8) ? hl.L(10.0f) : 0;
        if (q9cVar != null && q9cVar.k3 && g1cVar.s) {
            z2 = true;
        }
        g1cVar.setReorder(z2);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new g1c(i, vnbVar, context);
    }
}
