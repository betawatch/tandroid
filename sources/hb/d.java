package hb;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class d implements eb.v {
    public final /* synthetic */ int a;
    public final qf.b b;

    public /* synthetic */ d(qf.b bVar, int i10) {
        this.a = i10;
        this.b = bVar;
    }

    @Override // eb.v
    public final eb.u create(eb.g gVar, lb.a aVar) {
        Class cls;
        Type[] actualTypeArguments;
        int i10 = this.a;
        qf.b bVar = this.b;
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
                gb.d.b(Collection.class.isAssignableFrom(cls2));
                Type j10 = gb.d.j(type, cls2, gb.d.g(type, cls2, Collection.class), new HashMap());
                cls = j10 instanceof ParameterizedType ? ((ParameterizedType) j10).getActualTypeArguments()[0] : Object.class;
                return new c(gVar, cls, gVar.b(new lb.a(cls)), bVar.W(aVar));
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
                    gb.d.b(Map.class.isAssignableFrom(cls3));
                    Type j11 = gb.d.j(type2, cls3, gb.d.g(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = j11 instanceof ParameterizedType ? ((ParameterizedType) j11).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                eb.u b10 = (type3 == Boolean.TYPE || type3 == Boolean.class) ? h1.c : gVar.b(new lb.a(type3));
                eb.u b11 = gVar.b(new lb.a(actualTypeArguments[1]));
                gb.n W = bVar.W(aVar);
                Type[] typeArr = actualTypeArguments;
                return new o(this, gVar, typeArr[0], b10, typeArr[1], b11, W);
        }
    }
}
