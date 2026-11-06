package c8;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class m0 {
    public static id.f a(id.f fVar, id.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), key)) {
            return fVar;
        }
        return null;
    }

    public static id.h b(id.f fVar, id.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        return kotlin.jvm.internal.j.a(fVar.getKey(), key) ? id.i.a : fVar;
    }

    public static id.h c(id.f fVar, id.h context) {
        kotlin.jvm.internal.j.e(context, "context");
        return context == id.i.a ? fVar : (id.h) context.fold(fVar, new b1.e(9));
    }
}
