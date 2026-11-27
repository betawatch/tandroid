// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
