package c0;

import java.io.Serializable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i {
    public Serializable a;
    public k b;
    public l c;
    public boolean d;

    public final void a() {
        this.d = true;
        k kVar = this.b;
        if (kVar == null || !kVar.b.k(null)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        l lVar;
        k kVar = this.b;
        if (kVar != null) {
            j jVar = kVar.b;
            if (!jVar.isDone()) {
                jVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 1));
            }
        }
        if (this.d || (lVar = this.c) == null) {
            return;
        }
        lVar.k(null);
    }
}
