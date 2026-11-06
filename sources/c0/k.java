package c0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
