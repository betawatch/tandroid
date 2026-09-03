package ld;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.k implements dd.p {
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

    @Override // dd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((uc.h) obj).plus((uc.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((uc.h) obj).plus((uc.f) obj2);
        }
    }
}
