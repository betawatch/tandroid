package c0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class i {
    public Object a;
    public l b;
    public m c;
    public boolean d;

    public final void a(Boolean bool) {
        this.d = true;
        l lVar = this.b;
        if (lVar == null || !lVar.b.k(bool)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        m mVar;
        l lVar = this.b;
        if (lVar != null) {
            k kVar = lVar.b;
            if (!kVar.isDone()) {
                kVar.l(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 1));
            }
        }
        if (this.d || (mVar = this.c) == null) {
            return;
        }
        mVar.k(null);
    }
}
