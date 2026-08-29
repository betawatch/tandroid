package a9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t implements z9.b {
    public static final f c;
    public static final h d;
    public z9.a a;
    public volatile z9.b b;

    static {
        int i10 = 1;
        c = new f(i10);
        d = new h(i10);
    }

    public t(f fVar, z9.b bVar) {
        this.a = fVar;
        this.b = bVar;
    }

    public final void a(z9.a aVar) {
        z9.b bVar;
        z9.b bVar2;
        z9.b bVar3 = this.b;
        h hVar = d;
        if (bVar3 != hVar) {
            aVar.j(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != hVar) {
                bVar2 = bVar;
            } else {
                this.a = new s(0, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.j(bVar);
        }
    }

    @Override // z9.b
    public final Object get() {
        return this.b.get();
    }
}
