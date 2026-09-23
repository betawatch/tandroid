package ah;

import android.graphics.RenderNode;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class k {
    public final RenderNode a;
    public final j b;
    public final a c = new a();
    public long d = 0;
    public int e;
    public int f;

    public k(RenderNode renderNode, j jVar) {
        this.a = renderNode;
        this.b = jVar;
    }

    public final void a() {
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        a aVar = this.c;
        aVar.b = 0L;
        aVar.a = false;
        j jVar = this.b;
        jVar.m(aVar);
        long j3 = aVar.a ? -1L : aVar.b;
        boolean z10 = (this.a.hasDisplayList() && width == this.e && height == this.f && j3 == this.d && j3 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j3;
        if (z10) {
            jVar.b(this.a.beginRecording());
            this.a.endRecording();
        }
    }
}
