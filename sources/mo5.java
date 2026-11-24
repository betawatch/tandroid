// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class mo5 implements kt8, ky9 {
    public final Object a;

    public /* synthetic */ mo5(Object obj) {
        this.a = obj;
    }

    public static mo5 a(Object obj) {
        if (obj != null) {
            return new mo5(obj);
        }
        fvc.f("instance cannot be null");
        return null;
    }

    public final Object b() {
        if (hed.b == null) {
            hed.b = new v30();
        }
        synchronized (hed.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // lt8
    public final Object get() {
        return this.a;
    }
}
