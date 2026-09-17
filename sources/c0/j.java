package c0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
