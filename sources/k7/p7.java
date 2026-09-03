package k7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class p7 {
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
