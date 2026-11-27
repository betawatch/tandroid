// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class j5f {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            p3d.h("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            p3d.h(qd4.y("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
