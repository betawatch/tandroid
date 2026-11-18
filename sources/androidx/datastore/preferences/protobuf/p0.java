package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
