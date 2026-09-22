package ah;

import android.graphics.RenderNode;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class l {
    public final RenderNode a;
    public final k b;
    public final a c = new a();
    public long d = 0;
    public int e;
    public int f;

    public l(RenderNode renderNode, k kVar) {
        this.a = renderNode;
        this.b = kVar;
    }

    public final void a() {
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        a aVar = this.c;
        aVar.b = 0L;
        aVar.a = false;
        k kVar = this.b;
        kVar.y(aVar);
        long j3 = aVar.a ? -1L : aVar.b;
        boolean z10 = (this.a.hasDisplayList() && width == this.e && height == this.f && j3 == this.d && j3 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j3;
        if (z10) {
            kVar.b(this.a.beginRecording());
            this.a.endRecording();
        }
    }
}
