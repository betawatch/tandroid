package oa;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class a implements la.v {
    @Override // la.v
    public final la.u create(la.g gVar, sa.a aVar) {
        Type type = aVar.b;
        boolean z10 = type instanceof GenericArrayType;
        if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z10 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new b(gVar, gVar.b(new sa.a(genericComponentType)), na.d.h(genericComponentType));
    }
}
