package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class cc {
    public static fd.f a(fd.f fVar, fd.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static fd.h b(fd.f fVar, fd.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        return kotlin.jvm.internal.j.a(fVar.getKey(), key) ? fd.i.a : fVar;
    }

    public static fd.h c(fd.f fVar, fd.h context) {
        kotlin.jvm.internal.j.e(context, "context");
        return context == fd.i.a ? fVar : (fd.h) context.fold(fVar, new ae.j(9));
    }
}
