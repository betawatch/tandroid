package c0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b extends Throwable {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i7) {
        super(str);
        this.a = i7;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    private final synchronized Throwable c() {
        return this;
    }

    private final synchronized Throwable d() {
        return this;
    }

    private final synchronized Throwable e() {
        return this;
    }

    private final synchronized Throwable f() {
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.a) {
            case 0:
                a();
                break;
            case 1:
                b();
                break;
            case 2:
                c();
                break;
            case 3:
                d();
                break;
            case 4:
                e();
                break;
            default:
                f();
                break;
        }
        return this;
    }
}
