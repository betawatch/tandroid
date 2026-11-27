// default package

import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fh implements ToLongFunction {
    public final /* synthetic */ byte a;

    public /* synthetic */ fh(byte b) {
        this.a = b;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return ((r47) obj).Z0();
            case 1:
                return Long.parseLong((String) obj);
            case 2:
                return ((hp7) obj).e;
            case 3:
                return ((hp7) obj).e;
            case 4:
                if (((t1b) obj).b == null) {
                    return 0L;
                }
                return r0.k.date;
            case 5:
                return ((vsc) obj).I;
            default:
                return ((vsc) obj).J;
        }
    }
}
