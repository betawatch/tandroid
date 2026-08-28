package g7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class u6 {
    public static qc.f a(qc.f fVar, qc.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static qc.h b(qc.f fVar, qc.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return kotlin.jvm.internal.i.a(fVar.getKey(), key) ? qc.i.a : fVar;
    }

    public static qc.h c(qc.f fVar, qc.h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == qc.i.a ? fVar : (qc.h) context.fold(fVar, new b1.e(5));
    }
}
