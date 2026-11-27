package j$.time;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g {
    public static /* synthetic */ void a(long j) {
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static /* synthetic */ void b(Object obj, String str) {
        throw new j$.time.temporal.r(str + obj);
    }

    public static /* synthetic */ void c(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void d(String str, int i) {
        throw new c(str + i);
    }

    public static /* synthetic */ void e(String str, int i, Object obj) {
        throw new c(str + i + obj);
    }

    public static /* synthetic */ void f(String str, Object obj, Object obj2) {
        throw new c(str + obj + ((Object) " of type ") + obj2);
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2, Throwable th) {
        throw new c(str + obj + ((Object) " of type ") + obj2, th);
    }

    public static /* synthetic */ void h(String str, Object[] objArr) {
        throw new IllegalStateException(String.format(str, objArr));
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new c(str + obj);
    }

    public static /* synthetic */ void j(String str, int i) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2) {
        throw new ClassCastException(str + obj + ((Object) ", actual: ") + obj2);
    }
}
