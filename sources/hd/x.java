package hd;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.j implements zc.p {
    public static final x c;
    public static final x d;
    public final /* synthetic */ int b;

    static {
        int i9 = 2;
        c = new x(i9, 0);
        d = new x(i9, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i9, int i10) {
        super(i9);
        this.b = i10;
    }

    @Override // zc.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((qc.h) obj).plus((qc.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((qc.h) obj).plus((qc.f) obj2);
        }
    }
}
