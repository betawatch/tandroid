package c0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
