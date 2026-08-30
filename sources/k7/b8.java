package k7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class b8 {
    public static uc.f a(uc.f fVar, uc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static uc.h b(uc.f fVar, uc.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        return kotlin.jvm.internal.j.a(fVar.getKey(), key) ? uc.i.a : fVar;
    }

    public static uc.h c(uc.f fVar, uc.h context) {
        kotlin.jvm.internal.j.e(context, "context");
        return context == uc.i.a ? fVar : (uc.h) context.fold(fVar, new b1.e(5));
    }
}
