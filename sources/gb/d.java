package gb;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d implements db.v {
    public final /* synthetic */ int a;
    public final pf.b b;

    public /* synthetic */ d(pf.b bVar, int i10) {
        this.a = i10;
        this.b = bVar;
    }

    @Override // db.v
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls;
        Type[] actualTypeArguments;
        int i10 = this.a;
        pf.b bVar = this.b;
        cls = Object.class;
        switch (i10) {
            case 0:
                Type type = aVar.b;
                Class cls2 = aVar.a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                fb.d.b(Collection.class.isAssignableFrom(cls2));
                Type j3 = fb.d.j(type, cls2, fb.d.g(type, cls2, Collection.class), new HashMap());
                cls = j3 instanceof ParameterizedType ? ((ParameterizedType) j3).getActualTypeArguments()[0] : Object.class;
                return new c(gVar, cls, gVar.b(new kb.a(cls)), bVar.T(aVar));
            default:
                Type type2 = aVar.b;
                Class cls3 = aVar.a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    fb.d.b(Map.class.isAssignableFrom(cls3));
                    Type j10 = fb.d.j(type2, cls3, fb.d.g(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = j10 instanceof ParameterizedType ? ((ParameterizedType) j10).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                db.u b10 = (type3 == Boolean.TYPE || type3 == Boolean.class) ? h1.c : gVar.b(new kb.a(type3));
                db.u b11 = gVar.b(new kb.a(actualTypeArguments[1]));
                fb.n T = bVar.T(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], b10, typeArr[1], b11, T);
        }
    }
}
