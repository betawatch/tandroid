package ce;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.j implements ud.p {
    public static final x c;
    public static final x d;
    public final /* synthetic */ int b;

    static {
        int i10 = 2;
        c = new x(i10, 0);
        d = new x(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10, int i11) {
        super(i10);
        this.b = i11;
    }

    @Override // ud.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((ld.h) obj).plus((ld.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((ld.h) obj).plus((ld.f) obj2);
        }
    }
}
