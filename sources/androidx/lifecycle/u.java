package androidx.lifecycle;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class u {
    public n a;
    public r b;

    public final void a(t tVar, m mVar) {
        n a10 = mVar.a();
        n state1 = this.a;
        kotlin.jvm.internal.j.e(state1, "state1");
        if (a10.compareTo(state1) < 0) {
            state1 = a10;
        }
        this.a = state1;
        this.b.d(tVar, mVar);
        this.a = a10;
    }
}
