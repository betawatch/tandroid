package ae;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.j implements sd.p {
    public static final y c;
    public static final y d;
    public final /* synthetic */ int b;

    static {
        int i10 = 2;
        c = new y(i10, 0);
        d = new y(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i10, int i11) {
        super(i10);
        this.b = i11;
    }

    @Override // sd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((jd.h) obj).plus((jd.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((jd.h) obj).plus((jd.f) obj2);
        }
    }
}
