package ad;

import java.util.Random;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends a {
    public final b b = new b(0);

    @Override // ad.a
    public final Random a() {
        Object obj = this.b.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
