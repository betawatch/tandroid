package c0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends Throwable {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i9) {
        super(str);
        this.a = i9;
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
            default:
                e();
                break;
        }
        return this;
    }
}
