package nh;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.g0;
import v4.e1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e extends d {
    public final /* synthetic */ h h;

    public e(h hVar) {
        this.h = hVar;
        this.e = -1;
    }

    @Override // v4.h0
    public final e1 x(ViewGroup viewGroup, int i7) {
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
