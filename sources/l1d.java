// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
