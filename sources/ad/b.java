package ad;

import java.util.Random;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return new Random();
            case 1:
                return Boolean.FALSE;
            case 2:
                return 0L;
            default:
                te.d dVar = new te.d();
                dVar.a = new byte[4096];
                return dVar;
        }
    }
}
