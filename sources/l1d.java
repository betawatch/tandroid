// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class l1d extends wye {
    public final WeakReference a;

    public l1d(m1d m1dVar) {
        this.a = new WeakReference(m1dVar);
    }

    @Override // wye
    public final void a() {
        m1d m1dVar = (m1d) this.a.get();
        if (m1dVar == null) {
            return;
        }
        m1dVar.g();
    }
}
