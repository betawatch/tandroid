package ia;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v implements ld.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ld.c
    public final Object c(Object obj, tc.c cVar) {
        switch (this.a) {
            case 0:
                ((d0) this.b).c.set((o) obj);
                return pc.i.a;
            default:
                ((kotlin.jvm.internal.q) this.b).a = obj;
                throw new md.a(this);
        }
    }
}
