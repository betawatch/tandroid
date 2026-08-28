package ig;

import android.graphics.RenderNode;
import g.x;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        gVar.x0(xVar);
        long j10 = xVar.b ? -1L : xVar.a;
        boolean z10 = (this.a.hasDisplayList() && width == this.e && height == this.f && j10 == this.d && j10 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j10;
        if (z10) {
            gVar.k(this.a.beginRecording());
            this.a.endRecording();
        }
    }
}
