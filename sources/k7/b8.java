package k7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
