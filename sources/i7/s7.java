package i7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class s7 {
    public static sc.f a(sc.f fVar, sc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static sc.h b(sc.f fVar, sc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        return kotlin.jvm.internal.j.a(fVar.getKey(), key) ? sc.i.a : fVar;
    }

    public static sc.h c(sc.f fVar, sc.h context) {
        kotlin.jvm.internal.j.e(context, "context");
        return context == sc.i.a ? fVar : (sc.h) context.fold(fVar, new b1.e(5));
    }
}
