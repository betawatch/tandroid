package oa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements la.v {
    public final /* synthetic */ int a;
    public final g5.b b;

    public /* synthetic */ d(g5.b bVar, int i9) {
        this.a = i9;
        this.b = bVar;
    }

    @Override // la.v
    public final la.u create(la.g gVar, sa.a aVar) {
        Class cls;
        Type[] actualTypeArguments;
        int i9 = this.a;
        g5.b bVar = this.b;
        cls = Object.class;
        switch (i9) {
            case 0:
                Type type = aVar.b;
                Class cls2 = aVar.a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                na.d.b(Collection.class.isAssignableFrom(cls2));
                Type j10 = na.d.j(type, cls2, na.d.g(type, cls2, Collection.class), new HashMap());
                cls = j10 instanceof ParameterizedType ? ((ParameterizedType) j10).getActualTypeArguments()[0] : Object.class;
                return new c(gVar, cls, gVar.b(new sa.a(cls)), bVar.l(aVar));
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
                    na.d.b(Map.class.isAssignableFrom(cls3));
                    Type j11 = na.d.j(type2, cls3, na.d.g(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = j11 instanceof ParameterizedType ? ((ParameterizedType) j11).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                la.u b10 = (type3 == Boolean.TYPE || type3 == Boolean.class) ? h1.c : gVar.b(new sa.a(type3));
                la.u b11 = gVar.b(new sa.a(actualTypeArguments[1]));
                na.n l10 = bVar.l(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], b10, typeArr[1], b11, l10);
        }
    }
}
