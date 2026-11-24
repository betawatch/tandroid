// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class h1d extends z0d {
    public final WeakReference c;

    public h1d(j1d j1dVar) {
        super((byte) 1);
        this.c = new WeakReference(j1dVar);
    }

    @Override // z0d
    public final void U(c3d c3dVar) {
        j1d j1dVar = (j1d) this.c.get();
        if (j1dVar == null) {
            return;
        }
        f1d f1dVar = new f1d(this, j1dVar, j1dVar, c3dVar);
        k1d k1dVar = j1dVar.a.e;
        k1dVar.sendMessage(k1dVar.obtainMessage(1, f1dVar));
    }
}
