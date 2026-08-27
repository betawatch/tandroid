package h7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class y6 {
    public static rc.f a(rc.f fVar, rc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static rc.h b(rc.f fVar, rc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        return kotlin.jvm.internal.j.a(fVar.getKey(), key) ? rc.i.a : fVar;
    }

    public static rc.h c(rc.f fVar, rc.h context) {
        kotlin.jvm.internal.j.e(context, "context");
        return context == rc.i.a ? fVar : (rc.h) context.fold(fVar, new b1.e(5));
    }
}
