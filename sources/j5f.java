// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
