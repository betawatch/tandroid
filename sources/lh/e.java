package lh;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import s4.c1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class e extends d {
    public final /* synthetic */ h h;

    public e(h hVar) {
        this.h = hVar;
        this.e = -1;
    }

    @Override // s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        c cVar = new c(viewGroup.getContext());
        cVar.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        b bVar = new b(cVar);
        h hVar = this.h;
        View view = hVar.Y0;
        RenderNode renderNode = hVar.W0;
        float f7 = hVar.X0;
        c cVar2 = bVar.v;
        cVar2.G = view;
        cVar2.E = renderNode;
        cVar2.F = f7;
        cVar2.setDelegate(hVar.a1);
        return bVar;
    }
}
