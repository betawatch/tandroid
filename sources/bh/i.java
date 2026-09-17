package bh;

import android.graphics.RenderNode;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class i {
    public final RenderNode a;
    public final h b;
    public final a c = new a();
    public long d = 0;
    public int e;
    public int f;

    public i(RenderNode renderNode, h hVar) {
        this.a = renderNode;
        this.b = hVar;
    }

    public final void a() {
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        a aVar = this.c;
        aVar.b = 0L;
        aVar.a = false;
        h hVar = this.b;
        hVar.v(aVar);
        long j3 = aVar.a ? -1L : aVar.b;
        boolean z10 = (this.a.hasDisplayList() && width == this.e && height == this.f && j3 == this.d && j3 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j3;
        if (z10) {
            hVar.k(this.a.beginRecording());
            this.a.endRecording();
        }
    }
}
