// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class ixe {
    public static final ge9 a(Throwable th) {
        th.getClass();
        return new ge9(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof ge9) {
            throw ((ge9) obj).a;
        }
    }
}
