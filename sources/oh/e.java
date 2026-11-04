package oh;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.g0;
import u4.d1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e extends d {
    public final /* synthetic */ h h;

    public e(h hVar) {
        this.h = hVar;
        this.e = -1;
    }

    @Override // u4.h0
    public final d1 x(ViewGroup viewGroup, int i3) {
        c cVar = new c(viewGroup.getContext());
        cVar.setPadding(g0.L(22.0f), 0, g0.L(22.0f), 0);
        b bVar = new b(cVar);
        h hVar = this.h;
        View view = hVar.X0;
        RenderNode renderNode = hVar.V0;
        float f10 = hVar.W0;
        c cVar2 = bVar.v;
        cVar2.H = view;
        cVar2.F = renderNode;
        cVar2.G = f10;
        cVar2.setDelegate(hVar.Z0);
        return bVar;
    }
}
