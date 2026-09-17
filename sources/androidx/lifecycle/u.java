package androidx.lifecycle;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class u {
    public n a;
    public r b;

    public final void a(t tVar, m mVar) {
        n a2 = mVar.a();
        n state1 = this.a;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (a2.compareTo(state1) < 0) {
            state1 = a2;
        }
        this.a = state1;
        this.b.d(tVar, mVar);
        this.a = a2;
    }
}
