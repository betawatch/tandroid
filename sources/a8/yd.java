package a8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class yd {
    public static ld.f a(ld.f fVar, ld.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static ld.h b(ld.f fVar, ld.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return kotlin.jvm.internal.i.a(fVar.getKey(), key) ? ld.i.a : fVar;
    }

    public static ld.h c(ld.f fVar, ld.h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == ld.i.a ? fVar : (ld.h) context.fold(fVar, new b1.e(5));
    }
}
