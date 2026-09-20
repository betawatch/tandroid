package ah;

import android.graphics.RenderNode;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        kVar.K(aVar);
        long j3 = aVar.a ? -1L : aVar.b;
        boolean z10 = (this.a.hasDisplayList() && width == this.e && height == this.f && j3 == this.d && j3 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j3;
        if (z10) {
            kVar.d(this.a.beginRecording());
            this.a.endRecording();
        }
    }
}
