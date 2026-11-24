// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n3d extends y0f {
    public final WeakReference a;

    public n3d(o3d o3dVar) {
        this.a = new WeakReference(o3dVar);
    }

    @Override // y0f
    public final void a() {
        o3d o3dVar = (o3d) this.a.get();
        if (o3dVar == null) {
            return;
        }
        o3dVar.g();
    }
}
