package c8;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class p0 {
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
