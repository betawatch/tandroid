// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_agent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bd extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new bd());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((cd) view).a((TL_agent.agentProvider) c6cVar.H, null, false, c6cVar.e, c6cVar.A == 1, z);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new cd(i, ylbVar, context);
    }
}
