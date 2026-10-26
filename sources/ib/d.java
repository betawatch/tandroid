package ib;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d implements fb.v {
    public final /* synthetic */ int a;
    public final rf.b b;

    public /* synthetic */ d(rf.b bVar, int i10) {
        this.a = i10;
        this.b = bVar;
    }

    @Override // fb.v
    public final fb.u create(fb.g gVar, mb.a aVar) {
        Class cls;
        Type[] actualTypeArguments;
        int i10 = this.a;
        rf.b bVar = this.b;
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
                hb.d.b(Collection.class.isAssignableFrom(cls2));
                Type j10 = hb.d.j(type, cls2, hb.d.g(type, cls2, Collection.class), new HashMap());
                cls = j10 instanceof ParameterizedType ? ((ParameterizedType) j10).getActualTypeArguments()[0] : Object.class;
                return new c(gVar, cls, gVar.b(new mb.a(cls)), bVar.K(aVar));
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
                    hb.d.b(Map.class.isAssignableFrom(cls3));
                    Type j11 = hb.d.j(type2, cls3, hb.d.g(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = j11 instanceof ParameterizedType ? ((ParameterizedType) j11).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                fb.u b10 = (type3 == Boolean.TYPE || type3 == Boolean.class) ? h1.c : gVar.b(new mb.a(type3));
                fb.u b11 = gVar.b(new mb.a(actualTypeArguments[1]));
                hb.n K = bVar.K(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], b10, typeArr[1], b11, K);
        }
    }
}
