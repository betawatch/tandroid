package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class p0 {
    public static o0 a(Object obj, Object obj2) {
        o0 o0Var = (o0) obj;
        o0 o0Var2 = (o0) obj2;
        if (!o0Var2.isEmpty()) {
            if (!o0Var.a) {
                o0Var = o0Var.c();
            }
            o0Var.b();
            if (!o0Var2.isEmpty()) {
                o0Var.putAll(o0Var2);
            }
        }
        return o0Var;
    }
}
