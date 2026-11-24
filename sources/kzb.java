// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kzb extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new kzb());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        lzb lzbVar = (lzb) view;
        boolean z2 = false;
        if (c6cVar.s) {
            lzbVar.e();
        } else {
            Object obj = c6cVar.H;
            if (obj == null) {
                if (c6cVar.C == -2) {
                    lzbVar.b(c6cVar.r, c6cVar.e);
                } else {
                    lzbVar.c((c6cVar.z & 1) != 0, c6cVar.r, c6cVar.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (c6cVar.J) {
                    lzbVar.a(c6cVar.y, (TLRPC.TL_forumTopic) obj, c6cVar.e);
                } else {
                    lzbVar.f((TLRPC.TL_forumTopic) obj, c6cVar.e);
                }
            }
        }
        if (q7cVar != null && q7cVar.k3 && lzbVar.F) {
            z2 = true;
        }
        lzbVar.setReorder(z2);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new lzb(i, ylbVar, context);
    }
}
