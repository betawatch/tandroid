package c0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class k extends h {
    public final /* synthetic */ l n;

    public k(l lVar) {
        this.n = lVar;
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
