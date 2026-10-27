package ib;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class a implements fb.v {
    @Override // fb.v
    public final fb.u create(fb.g gVar, mb.a aVar) {
        Type type = aVar.b;
        boolean z10 = type instanceof GenericArrayType;
        if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z10 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new b(gVar, gVar.b(new mb.a(genericComponentType)), hb.d.h(genericComponentType));
    }
}
