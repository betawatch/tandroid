package androidx.lifecycle;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
