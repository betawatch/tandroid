// default package

import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class bvd {
    public static String a(String str) {
        List list = null;
        if (str != null) {
            return k7b.u(new k7b(str, list));
        }
        lq5.j("applicationId cannot be null");
        return null;
    }
}
