// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class j1c extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new j1c());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        k1c k1cVar = (k1c) view;
        boolean z2 = false;
        if (b8cVar.s) {
            k1cVar.e();
        } else {
            Object obj = b8cVar.H;
            if (obj == null) {
                if (b8cVar.C == -2) {
                    k1cVar.b(b8cVar.r, b8cVar.e);
                } else {
                    k1cVar.c((b8cVar.z & 1) != 0, b8cVar.r, b8cVar.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (b8cVar.J) {
                    k1cVar.a(b8cVar.y, (TLRPC.TL_forumTopic) obj, b8cVar.e);
                } else {
                    k1cVar.f((TLRPC.TL_forumTopic) obj, b8cVar.e);
                }
            }
        }
        if (q9cVar != null && q9cVar.k3 && k1cVar.F) {
            z2 = true;
        }
        k1cVar.setReorder(z2);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new k1c(i, vnbVar, context);
    }
}
