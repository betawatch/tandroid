package c0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
