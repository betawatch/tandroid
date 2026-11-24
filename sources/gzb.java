// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gzb extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new gzb());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        hzb hzbVar = (hzb) view;
        boolean z2 = false;
        if (c6cVar.s) {
            hzbVar.f();
        } else {
            Object obj = c6cVar.H;
            if (obj == null) {
                if (c6cVar.d == -2) {
                    hzbVar.c();
                } else {
                    hzbVar.d((c6cVar.z & 1) != 0, c6cVar.r, c6cVar.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                boolean z3 = c6cVar.J;
                long j = c6cVar.y;
                if (z3) {
                    hzbVar.b(j, (TLRPC.TL_forumTopic) obj, c6cVar.e);
                } else {
                    hzbVar.g(j, (TLRPC.TL_forumTopic) obj, c6cVar.e);
                }
            }
        }
        hzbVar.M = iqd.a(c6cVar.z, 8) ? gm.L(10.0f) : 0;
        if (q7cVar != null && q7cVar.k3 && hzbVar.s) {
            z2 = true;
        }
        hzbVar.setReorder(z2);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new hzb(i, ylbVar, context);
    }
}
