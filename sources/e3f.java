// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class e3f {
    public static final o8a a(o8a o8aVar, sjf sjfVar) {
        o8aVar.getClass();
        sjfVar.getClass();
        if (!ur5.a(o8aVar.e(), q8a.b)) {
            return o8aVar.isInline() ? a(o8aVar.i(0), sjfVar) : o8aVar;
        }
        nyd.a(o8aVar);
        return o8aVar;
    }

    public static final k3d b(qw5 qw5Var, o8a o8aVar) {
        o8aVar.getClass();
        nye e = o8aVar.e();
        if (e instanceof vi8) {
            return k3d.f;
        }
        if (ur5.a(e, tdb.c)) {
            return k3d.d;
        }
        if (!ur5.a(e, tdb.d)) {
            return k3d.c;
        }
        o8a a = a(o8aVar.i(0), qw5Var.b);
        nye e2 = a.e();
        if ((e2 instanceof nm8) || ur5.a(e2, q8a.c)) {
            return k3d.e;
        }
        throw new ww5("Value of type '" + a.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + a.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
}
