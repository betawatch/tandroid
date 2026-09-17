package c0;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class j extends h {
    public final /* synthetic */ k n;

    public j(k kVar) {
        this.n = kVar;
    }

    @Override // c0.h
    public final String i() {
        i iVar = (i) this.n.a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.a + "]";
    }
}
