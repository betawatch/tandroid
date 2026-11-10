package nh;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.g0;
import v4.d1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e extends d {
    public final /* synthetic */ h h;

    public e(h hVar) {
        this.h = hVar;
        this.e = -1;
    }

    @Override // v4.g0
    public final d1 x(ViewGroup viewGroup, int i7) {
        c cVar = new c(viewGroup.getContext());
        cVar.setPadding(g0.L(22.0f), 0, g0.L(22.0f), 0);
        b bVar = new b(cVar);
        h hVar = this.h;
        View view = hVar.W0;
        RenderNode renderNode = hVar.U0;
        float f10 = hVar.V0;
        c cVar2 = bVar.v;
        cVar2.G = view;
        cVar2.E = renderNode;
        cVar2.F = f10;
        cVar2.setDelegate(hVar.Y0);
        return bVar;
    }
}
