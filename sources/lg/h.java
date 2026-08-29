package lg;

import android.graphics.RenderNode;
import g.x;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        gVar.q(xVar);
        long j10 = xVar.b ? -1L : xVar.a;
        boolean z10 = (this.a.hasDisplayList() && width == this.e && height == this.f && j10 == this.d && j10 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j10;
        if (z10) {
            gVar.d(this.a.beginRecording());
            this.a.endRecording();
        }
    }
}
