package nh;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import s4.e1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e extends d {
    public final /* synthetic */ h h;

    public e(h hVar) {
        this.h = hVar;
        this.e = -1;
    }

    @Override // s4.h0
    public final e1 x(ViewGroup viewGroup, int i10) {
        c cVar = new c(viewGroup.getContext());
        cVar.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        b bVar = new b(cVar);
        h hVar = this.h;
        View view = hVar.W0;
        RenderNode renderNode = hVar.U0;
        float f7 = hVar.V0;
        c cVar2 = bVar.v;
        cVar2.G = view;
        cVar2.E = renderNode;
        cVar2.F = f7;
        cVar2.setDelegate(hVar.Y0);
        return bVar;
    }
}
