package og;

import android.graphics.RenderNode;
import g.x;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h {
    public final RenderNode a;
    public final g b;
    public final x c = new x();
    public long d = 0;
    public int e;
    public int f;

    public h(RenderNode renderNode, g gVar) {
        this.a = renderNode;
        this.b = gVar;
    }

    public final void a() {
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        x xVar = this.c;
        xVar.a = 0L;
        xVar.b = false;
        g gVar = this.b;
        gVar.P(xVar);
        long j10 = xVar.b ? -1L : xVar.a;
        boolean z4 = (this.a.hasDisplayList() && width == this.e && height == this.f && j10 == this.d && j10 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j10;
        if (z4) {
            gVar.i(this.a.beginRecording());
            this.a.endRecording();
        }
    }
}
