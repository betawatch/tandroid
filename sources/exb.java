// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class exb extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new exb());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        fxb fxbVar = (fxb) view;
        boolean z2 = false;
        if (c4cVar.s) {
            fxbVar.f();
        } else {
            Object obj = c4cVar.H;
            if (obj == null) {
                if (c4cVar.d == -2) {
                    fxbVar.c();
                } else {
                    fxbVar.d((c4cVar.z & 1) != 0, c4cVar.r, c4cVar.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                boolean z3 = c4cVar.J;
                long j = c4cVar.y;
                if (z3) {
                    fxbVar.b(j, (TLRPC.TL_forumTopic) obj, c4cVar.e);
                } else {
                    fxbVar.g(j, (TLRPC.TL_forumTopic) obj, c4cVar.e);
                }
            }
        }
        fxbVar.M = fod.a(c4cVar.z, 8) ? gl.L(10.0f) : 0;
        if (q5cVar != null && q5cVar.k3 && fxbVar.s) {
            z2 = true;
        }
        fxbVar.setReorder(z2);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new fxb(i, wjbVar, context);
    }
}
