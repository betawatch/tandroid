package c0;

import java.io.Serializable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
