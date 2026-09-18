package gb;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public class a implements db.v {
    @Override // db.v
    public final db.u create(db.g gVar, kb.a aVar) {
        Type type = aVar.b;
        boolean z10 = type instanceof GenericArrayType;
        if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z10 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new b(gVar, gVar.b(new kb.a(genericComponentType)), fb.d.h(genericComponentType));
    }
}
