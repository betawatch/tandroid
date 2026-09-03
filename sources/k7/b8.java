package k7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
