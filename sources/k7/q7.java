package k7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class q7 {
    public static final sc.e a(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        return new sc.e(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof sc.e) {
            throw ((sc.e) obj).a;
        }
    }
}
