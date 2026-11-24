// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j3d extends b3d {
    public final WeakReference c;

    public j3d(l3d l3dVar) {
        super((byte) 1);
        this.c = new WeakReference(l3dVar);
    }

    @Override // b3d
    public final void U(e5d e5dVar) {
        l3d l3dVar = (l3d) this.c.get();
        if (l3dVar == null) {
            return;
        }
        h3d h3dVar = new h3d(this, l3dVar, l3dVar, e5dVar);
        m3d m3dVar = l3dVar.a.e;
        m3dVar.sendMessage(m3dVar.obtainMessage(1, h3dVar));
    }
}
