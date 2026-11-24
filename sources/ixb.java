// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ixb extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new ixb());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        jxb jxbVar = (jxb) view;
        boolean z2 = false;
        if (c4cVar.s) {
            jxbVar.e();
        } else {
            Object obj = c4cVar.H;
            if (obj == null) {
                if (c4cVar.C == -2) {
                    jxbVar.b(c4cVar.r, c4cVar.e);
                } else {
                    jxbVar.c((c4cVar.z & 1) != 0, c4cVar.r, c4cVar.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (c4cVar.J) {
                    jxbVar.a(c4cVar.y, (TLRPC.TL_forumTopic) obj, c4cVar.e);
                } else {
                    jxbVar.f((TLRPC.TL_forumTopic) obj, c4cVar.e);
                }
            }
        }
        if (q5cVar != null && q5cVar.k3 && jxbVar.F) {
            z2 = true;
        }
        jxbVar.setReorder(z2);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new jxb(i, wjbVar, context);
    }
}
