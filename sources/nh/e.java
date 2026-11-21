package nh;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.g0;
import v4.f1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class e extends d {
    public final /* synthetic */ h h;

    public e(h hVar) {
        this.h = hVar;
        this.e = -1;
    }

    @Override // v4.i0
    public final f1 x(ViewGroup viewGroup, int i7) {
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
