package j3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements f5.k, f5.j {
    public final /* synthetic */ k0 a;

    public /* synthetic */ w(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // f5.k
    public void e(Object obj, f5.g gVar) {
        ((a2) obj).onEvents(this.a.f, new z1(gVar));
    }

    @Override // f5.j
    public void invoke(Object obj) {
        ((a2) obj).onAvailableCommandsChanged(this.a.N);
    }
}
