package ah;

import android.graphics.RenderNode;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
        jVar.U(aVar);
        long j3 = aVar.a ? -1L : aVar.b;
        boolean z10 = (this.a.hasDisplayList() && width == this.e && height == this.f && j3 == this.d && j3 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j3;
        if (z10) {
            jVar.d(this.a.beginRecording());
            this.a.endRecording();
        }
    }
}
