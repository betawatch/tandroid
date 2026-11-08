package c8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
