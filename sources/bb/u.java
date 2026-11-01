package bb;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class u implements wd.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // wd.c
    public final Object b(Object obj, ed.c cVar) {
        switch (this.a) {
            case 0:
                ((c0) this.b).c.set((n) obj);
                return ad.j.a;
            default:
                ((kotlin.jvm.internal.p) this.b).a = obj;
                throw new xd.a(this);
        }
    }
}
