package jg;

import android.graphics.RenderNode;
import g.y;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h {
    public final RenderNode a;
    public final g b;
    public final y c = new y();
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
        y yVar = this.c;
        yVar.a = 0L;
        yVar.b = false;
        g gVar = this.b;
        gVar.A(yVar);
        long j10 = yVar.b ? -1L : yVar.a;
        boolean z10 = (this.a.hasDisplayList() && width == this.e && height == this.f && j10 == this.d && j10 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j10;
        if (z10) {
            gVar.n(this.a.beginRecording());
            this.a.endRecording();
        }
    }
}
